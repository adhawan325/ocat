package com.non.ocat.web.interview;

import com.haulmont.bali.events.Subscription;
import com.haulmont.cuba.gui.UiComponents;
import com.haulmont.cuba.gui.components.*;
import com.haulmont.cuba.gui.screen.*;
import com.haulmont.cuba.gui.xml.layout.ComponentsFactory;
import com.non.ocat.entity.Interview;
import com.vaadin.ui.Component;
import com.vaadin.ui.declarative.Design;
import com.vaadin.ui.declarative.DesignContext;

import javax.inject.Inject;
import java.util.function.Consumer;

@UiController("ocat_Interview.edit")
@UiDescriptor("interview-edit.xml")
@EditedEntityContainer("interviewDc")
@LoadDataBeforeShow
public class InterviewEdit extends StandardEditor<Interview> {

    @Inject
    private TabSheet interview;
    @Inject
    private UiComponents componentsFactory;

    @Subscribe
    protected void onInit(InitEvent event) {

        Label label = componentsFactory.create(Label.class);
        label.setValue("Label " );

        GroupBoxLayout groupBoxLayout = componentsFactory.create(GroupBoxLayout.class);
        groupBoxLayout.setCaption("Group " );
        VBoxLayout tabContent = componentsFactory.create(VBoxLayout.class);
        tabContent.setSpacing(true);
        tabContent.setMargin(true, false, true, false);

        tabContent.add(label);
        tabContent.add(groupBoxLayout);
        tabContent.expand(groupBoxLayout);

        TabSheet.Tab tab = interview.addTab("tab", tabContent);
        tab.setCaption("Tab ");
    }
}