package com.devepos.adt.atm.ui.internal.forms;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.databinding.observable.value.WritableValue;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EContentAdapter;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.PlatformUI;

import com.devepos.adt.atm.model.abaptags.IAbapTagsFactory;
import com.devepos.adt.atm.model.abaptags.IAbapTagsPackage;
import com.devepos.adt.atm.model.abaptags.ITag;
import com.devepos.adt.atm.model.abaptags.ITagList;
import com.devepos.adt.atm.model.abaptags.TagSearchScope;
import com.devepos.adt.atm.model.validation.TagListValidator;
import com.devepos.adt.atm.tags.AbapTagsServiceFactory;
import com.devepos.adt.atm.tags.IAbapTagsService;
import com.devepos.adt.atm.ui.internal.messages.Messages;
import com.devepos.adt.tools.base.project.IAbapProjectProvider;
import com.devepos.adt.tools.base.util.IModificationListener;
import com.devepos.adt.tools.base.util.IModificationListener.ModificationKind;
import com.devepos.adt.tools.base.util.IModificationProvider;
import com.devepos.adt.tools.base.util.IStatusView;

/**
 * Model for ABAP Tags. To be used in the dialog for managing Tags
 *
 * @author stockbal
 */
public class AbapTagModel implements IModel, IModificationProvider<ITag> {

	private final IAbapProjectProvider projectProvider;
	private ITagList tags;
	private final IStatusView statusView;
	private boolean modelChanged;
	private final boolean globalTagsMode;
	private ITagList removedTags;
	private final List<IModificationListener<ITag>> modificationListener = new ArrayList<>();
	private final WritableValue<Boolean> valid = new WritableValue<>(true, Boolean.class);
	private final WritableValue<Boolean> editMode = new WritableValue<>(false, Boolean.class);
	private final WritableValue<Boolean> validProject = new WritableValue<>(false, Boolean.class);

	public AbapTagModel(final IAbapProjectProvider projectProvider, final IStatusView statusView, final boolean globalTagsMode) {
		this.projectProvider = projectProvider;
		this.statusView = statusView;
		this.globalTagsMode = globalTagsMode;
	}

	public void setModelChanged(final boolean modelChanged) {
		this.modelChanged = modelChanged;
	}

	/**
	 * @return {@code true} if the model has changed data
	 */
	public boolean hasModelChanged() {
		return this.modelChanged;
	}

	/**
	 * @return {@code true} if the model is valid
	 */
	@Override
	public boolean isValid() {
		return this.valid.getValue();
	}

	/**
	 * @param valid the new valid state of the model
	 */
	public void setValid(final boolean valid) {
		this.valid.setValue(valid);
	}

	/**
	 * @return {@code true} if model is in edit mode
	 */
	@Override
	public boolean isEditMode() {
		return this.editMode.getValue();
	}

	/**
	 * @param editMode the new editMode to be set
	 */
	public void setEditMode(final boolean editMode) {

		this.editMode.setValue(editMode);
	}

	/**
	 * @return {@code true} if the model has a valid project
	 */
	public boolean hasValidProject() {
		return this.validProject.getValue();
	}

	/**
	 * @param validProject the new value for the {@code validProject} flag
	 */
	public void setValidProject(final boolean validProject) {
		this.validProject.setValue(validProject);
		if (validProject) {
			refreshTags();
		} else {
			this.tags = null;
			fireModified(ModificationKind.CLEARED, null);
		}
	}

	public void refreshTags() {
		final Job lockJob = new Job(Messages.AbapTagModel_LoadingTagsJob_xmsg) {
			@Override
			protected IStatus run(final IProgressMonitor monitor) {
				final String destinationId = AbapTagModel.this.projectProvider.getDestinationId();

				final IAbapTagsService tagsService = AbapTagsServiceFactory.createTagsService();
				// read current tags from project
				final ITagList tags = tagsService.readTags(destinationId, getTagScope());
				updateTags(tags, false);

				Display.getDefault().asyncExec(() -> {
					fireModified(ModificationKind.UPDATED, null);
				});
				AbapTagModel.this.statusView.setViewStatus(Status.OK_STATUS);

				return Status.OK_STATUS;
			}
		};
		lockJob.setSystem(true);
		lockJob.schedule();
	}

	/**
	 * Saves the current list of tags
	 */
	public void saveTags() {
		final Job lockJob = new Job(Messages.AbapTagModel_SavingTagsJob_xmsg) {
			@Override
			protected IStatus run(final IProgressMonitor monitor) {
				final String destinationId = AbapTagModel.this.projectProvider.getDestinationId();

				final IAbapTagsService tagsService = AbapTagsServiceFactory.createTagsService();

				// update/create tags
				if (AbapTagModel.this.hasModelChanged()) {
					final IStatus updatedTagsStatus = tagsService.updateTags(AbapTagModel.this.tags, destinationId,
						getTagScope());
					if (updatedTagsStatus != null && updatedTagsStatus.getSeverity() == IStatus.ERROR
						|| updatedTagsStatus.getSeverity() == IStatus.CANCEL) {
						AbapTagModel.this.statusView.setViewStatus(updatedTagsStatus);
						return Status.CANCEL_STATUS;
					}
				}
				// delete tags
				final ITagList remTags = getRemovedTags();
				if (!remTags.getTags().isEmpty()) {
					final IStatus deleteTagsStatus = tagsService.deleteTags(getRemovedTags(), destinationId, getTagScope());
					if (deleteTagsStatus != null && deleteTagsStatus.getSeverity() == IStatus.ERROR
						|| deleteTagsStatus.getSeverity() == IStatus.CANCEL) {
						AbapTagModel.this.statusView.setViewStatus(deleteTagsStatus);
						return Status.CANCEL_STATUS;
					}
				}

				tagsService.unlockTags(destinationId, getTagScope());

				// read current tags from project
				final ITagList tags = tagsService.readTags(destinationId, getTagScope());
				updateTags(tags, false);

				// switch to edit mode
				Display.getDefault().asyncExec(() -> {
					fireModified(ModificationKind.UPDATED, null);
					setEditMode(false);
				});
				AbapTagModel.this.statusView.setViewStatus(Status.OK_STATUS);

				return Status.OK_STATUS;
			}
		};
		lockJob.setSystem(true);
		lockJob.schedule();
	}

	public boolean unlock(final boolean loadTags) {
		if (!isEditMode()) {
			return true;
		}
		if (hasModelChanged()) {
			if (!MessageDialog.openQuestion(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(),
				Messages.AbapTagModel_UnlockMessageDialogTitle_xtit, Messages.AbapTagModel_UnlockMessageDialogText_xmsg)) {
				return false;
			}
		}
		if (loadTags) {
			unlockAndLoadTags();
		} else {
			runUnlockTagsJob();
		}
		setModelChanged(false);
		return true;
	}

	public void editTags() {
		lockAndLoadTags();
	}

	public ITagList getTags() {
		if (this.tags == null) {
			this.tags = IAbapTagsFactory.eINSTANCE.createTagList();
			this.tags.eAdapters().add(new TagNotificationAdapter());
		}
		return this.tags;
	}

	/**
	 * Retrieves the current contents
	 *
	 * @return
	 */
	public Object[] getContents() {
		return getTags().getTags().toArray();
	}

	public ITag addNewTag(final ITag parent) {
		final ITag newTag = IAbapTagsFactory.eINSTANCE.createTag();
		if (parent == null) {
			getTags().getTags().add(newTag);
		} else {
			parent.getChildTags().add(newTag);
		}
		fireModified(ModificationKind.ADDED, newTag);
		return newTag;
	}

	public void removeTag(final ITag tag) {
		if (tag == null) {
			return;
		}
		final EObject container = tag.eContainer();
		if (container != null) {
			if (container instanceof ITag) {
				((ITag) container).getChildTags().remove(tag);
			} else if (container instanceof ITagList) {
				((ITagList) container).getTags().remove(tag);
			}
		}
		this.statusView.setViewStatus(Status.OK_STATUS);
		setValid(true);
		if (tag.getId() == null || tag.getId().isBlank()) {
			return;
		}
		final ITagList remTags = getRemovedTags();
		final ITag removedTag = IAbapTagsFactory.eINSTANCE.createTag();
		removedTag.setId(tag.getId());
		remTags.getTags().add(removedTag);
	}

	@Override
	public void addModificationListener(final IModificationListener<ITag> listener) {
		this.modificationListener.add(listener);
	}

	@Override
	public void removeModificationListener(final IModificationListener<ITag> listener) {
		this.modificationListener.remove(listener);
	}

	private ITagList getRemovedTags() {
		if (this.removedTags == null) {
			this.removedTags = IAbapTagsFactory.eINSTANCE.createTagList();
		}
		return this.removedTags;
	}

	private void runUnlockTagsJob() {
		final Job lockJob = new Job(Messages.AbapTagModel_UnlockJob_xmsg) {
			@Override
			protected IStatus run(final IProgressMonitor monitor) {
				final String destinationId = AbapTagModel.this.projectProvider.getDestinationId();
				final IAbapTagsService tagsService = AbapTagsServiceFactory.createTagsService();
				tagsService.unlockTags(destinationId, getTagScope());
				return Status.OK_STATUS;
			}
		};
		lockJob.setSystem(true);
		lockJob.schedule();

	}

	private void fireModified(final ModificationKind kind, final ITag modifiedTag) {
		for (final IModificationListener<ITag> l : this.modificationListener) {
			if (modifiedTag == null) {
				l.modified(kind);
			} else {
				l.modified(modifiedTag, kind);
			}
		}
	}

	private void updateTags(final ITagList tags, final boolean registerNotifiers) {
		this.tags = tags;
		this.removedTags = null;
		if (this.tags != null && registerNotifiers) {
			this.tags.eAdapters().add(new TagNotificationAdapter());
		}
	}

	private void lockAndLoadTags() {
		final Job lockJob = new Job(Messages.AbapTagModel_LoadingTagsJob_xmsg) {
			@Override
			protected IStatus run(final IProgressMonitor monitor) {
				final String destinationId = AbapTagModel.this.projectProvider.getDestinationId();

				final IAbapTagsService tagsService = AbapTagsServiceFactory.createTagsService();
				final IStatus lockStatus = tagsService.lockTags(destinationId, getTagScope());
				if (lockStatus != null && lockStatus.getSeverity() == IStatus.ERROR) {
					AbapTagModel.this.statusView.setViewStatus(lockStatus);
				} else {
					// read current tags from project
					final ITagList tags = tagsService.readTags(destinationId, getTagScope());
					updateTags(tags, true);

					// switch to edit mode
					Display.getDefault().asyncExec(() -> {
						fireModified(ModificationKind.UPDATED, null);
						setValid(true);
						setEditMode(true);
					});
					AbapTagModel.this.statusView.setViewStatus(Status.OK_STATUS);

				}
				return Status.OK_STATUS;
			}
		};
		lockJob.setSystem(true);
		lockJob.schedule();
	}

	private void unlockAndLoadTags() {
		final Job lockJob = new Job(Messages.AbapTagModel_LoadingTagsJob_xmsg) {
			@Override
			protected IStatus run(final IProgressMonitor monitor) {
				final String destinationId = AbapTagModel.this.projectProvider.getDestinationId();

				final IAbapTagsService tagsService = AbapTagsServiceFactory.createTagsService();
				tagsService.unlockTags(destinationId, getTagScope());
				// read current tags from project
				final ITagList tags = tagsService.readTags(destinationId, getTagScope());
				updateTags(tags, false);

				// switch to read only mode
				Display.getDefault().asyncExec(() -> {
					fireModified(ModificationKind.UPDATED, null);
					setValid(true);
					setEditMode(false);
				});
				AbapTagModel.this.statusView.setViewStatus(Status.OK_STATUS);

				return Status.OK_STATUS;
			}
		};
		lockJob.setSystem(true);
		lockJob.schedule();
	}

	private TagSearchScope getTagScope() {
		return this.globalTagsMode ? TagSearchScope.GLOBAL : TagSearchScope.USER;
	}

	private class TagNotificationAdapter extends EContentAdapter {
		@Override
		public void notifyChanged(final Notification notification) {
			super.notifyChanged(notification);
			final Object notifier = notification.getNotifier();
			final int eventType = notification.getEventType();

			if (notifier instanceof ITag) {
				final ITag changedTag = (ITag) notifier;
				IStatus tagStatus = changedTag.validate();
				setValid(tagStatus.getSeverity() == IStatus.OK);
				// validate the current level of tags
				if (isValid()) {
					final EObject tagCont = changedTag.eContainer();
					if (tagCont instanceof ITagList) {
						tagStatus = new TagListValidator(((ITagList) tagCont).getTags()).validate(true, false);
					} else if (tagCont instanceof ITag) {
						tagStatus = new TagListValidator(((ITag) tagCont).getChildTags()).validate(true, false);
					}
				}
				setValid(tagStatus.getSeverity() == IStatus.OK);
				AbapTagModel.this.statusView.setViewStatus(tagStatus);

				if (eventType == Notification.SET || eventType == Notification.ADD || eventType == Notification.REMOVE) {
					notifyOfTagChange(changedTag, notification.getFeature());
				}
			}
		}

		private void notifyOfTagChange(final ITag tag, final Object genericFeature) {
			if (tag == null) {
				return;
			}
			final EStructuralFeature structFeature = (EStructuralFeature) genericFeature;
			if (!(structFeature.getFeatureID() == IAbapTagsPackage.TAG__CHANGED)) {
				tag.setChanged(true);
				setModelChanged(true);
				fireModified(ModificationKind.UPDATED, tag);
			}

		}
	}
}