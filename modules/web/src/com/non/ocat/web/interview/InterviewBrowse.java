package com.non.ocat.web.interview;

import com.haulmont.cuba.core.global.DataManager;
import com.haulmont.cuba.core.global.LoadContext;
import com.haulmont.cuba.gui.Notifications;
import com.haulmont.cuba.gui.components.Button;
import com.haulmont.cuba.gui.components.GroupTable;
import com.haulmont.cuba.gui.model.CollectionLoader;
import com.haulmont.cuba.gui.screen.*;
import com.non.ocat.entity.Interview;
import io.swagger.models.auth.In;

import javax.inject.Inject;

import static sun.misc.VM.getState;

@UiController("ocat_Interview.browse")
@UiDescriptor("interview-browse.xml")
@LookupComponent("interviewsTable")
@LoadDataBeforeShow
public class InterviewBrowse extends StandardLookup<Interview> {
    @Inject
    private GroupTable<Interview> interviewsTable;
    @Inject
    private Button generateASR;
    @Inject
    private DataManager dataManager;
    @Inject
    private Notifications notifications;
    @Inject
    private CollectionLoader<Interview> interviewsDl;

    @Subscribe("generateASR")
    protected void generateASR(Button.ClickEvent event) {

        notifications.create().withCaption("This would generate an ASR").show();
    }

}