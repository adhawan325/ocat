package com.non.ocat.web.interview;

import com.haulmont.bali.events.Subscription;
import com.haulmont.cuba.gui.UiComponents;
import com.haulmont.cuba.gui.components.*;
import com.haulmont.cuba.gui.model.CollectionContainer;
import com.haulmont.cuba.gui.model.CollectionLoader;
import com.haulmont.cuba.gui.screen.*;
import com.haulmont.cuba.gui.xml.layout.ComponentsFactory;
import com.non.ocat.entity.Interview;
import com.non.ocat.entity.InterviewConfig;
import com.vaadin.ui.Component;
import com.vaadin.ui.declarative.Design;
import com.vaadin.ui.declarative.DesignContext;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

@UiController("ocat_Interview.edit")
@UiDescriptor("interview-edit.xml")
@EditedEntityContainer("interviewDc")
@LoadDataBeforeShow
public class InterviewEdit extends StandardEditor<Interview> {
    @Inject
    private CollectionContainer<InterviewConfig> interviewConfigsDc;
    @Inject
    private TabSheet interview;
    @Inject
    private UiComponents componentsFactory;
    @Inject
    private CollectionLoader<InterviewConfig> interviewConfigsDl;


    @Subscribe
    protected void onBeforeShow(BeforeShowEvent event) {
        interviewConfigsDl.load();
        System.out.println("found " + interviewConfigsDc.getItems().size());
        for( InterviewConfig config : interviewConfigsDc.getItems() )
        {
            if( config.getParent() == null )
            {
                addTopLevelTab(config);
                List<InterviewConfig> children = getChildren(config, interviewConfigsDc.getItems());
                System.out.println(children.size());
            }
        }
    }

    private void addTopLevelTab(InterviewConfig config)
    {
        VBoxLayout tabContent = componentsFactory.create(VBoxLayout.class);
        tabContent.setSpacing(true);
        tabContent.setMargin(true, false, true, false);
        Label label = componentsFactory.create(Label.class);
        label.setValue(config.getItemName());
        GroupBoxLayout groupBoxLayout = componentsFactory.create(GroupBoxLayout.class);
        groupBoxLayout.setCaption(config.getItemName());
        tabContent.add(label);
        tabContent.add(groupBoxLayout);
        tabContent.expand(groupBoxLayout);
        TabSheet.Tab tab = interview.addTab( config.getItemName(), tabContent);
        tab.setCaption(config.getItemName());
    }
    private List<InterviewConfig> getChildren(InterviewConfig parent, List<InterviewConfig> list)
    {
        List<InterviewConfig> returnList = new ArrayList<InterviewConfig>();
        for(InterviewConfig config : list )
        {
            if( config.getParent() != null && config.getParent().getItemCode().toString().equals(parent.getItemCode().toString()))
            {
                returnList.add(config);
            }
        }
        return returnList;

    }
}