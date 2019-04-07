package com.non.ocat.web.interview;

import com.haulmont.cuba.core.entity.Entity;
import com.haulmont.cuba.core.global.CommitContext;
import com.haulmont.cuba.core.global.DataManager;
import com.haulmont.cuba.core.global.LoadContext;
import com.haulmont.cuba.gui.components.Table;
import com.haulmont.cuba.gui.model.CollectionContainer;
import com.haulmont.cuba.gui.model.CollectionLoader;
import com.haulmont.cuba.gui.screen.*;
import com.haulmont.cuba.web.gui.components.table.TableItemPropertyWrapper;
import com.non.ocat.entity.Interview;
import com.non.ocat.entity.InterviewResponse;
import com.non.ocat.entity.Questionnaire;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@UiController("ocat_Interview.edit")
@UiDescriptor("interview-edit.xml")
@EditedEntityContainer("interviewDc")
public class InterviewEdit extends StandardEditor<Interview> {
    @Inject
    private DataManager dataManager;
    @Inject
    private CollectionContainer<InterviewResponse> interviewResponses;
    @Inject
    private CollectionLoader<InterviewResponse> interviewResponsesDl;

    @Subscribe
    protected void onInitEntity(InitEntityEvent<Interview> event) {
        //saveRecord();
        populateQuestions();

    }

    @Inject
    private Table<InterviewResponse> interviewResponsesTable;

    @Subscribe
    protected void onBeforeShow(BeforeShowEvent event) {
        interviewResponsesDl.setParameter("id", getEditedEntity());
        getScreenData().loadAll();
    }

    private Interview saveRecord()
    {
            System.out.println("saving");
            // need to create questions
        CommitContext commitContext = new CommitContext();
        commitContext.addInstanceToCommit(this.getEditedEntity());
        Set<Entity> thisEntity = dataManager.commit(commitContext);
        return(Interview)thisEntity.iterator().next();
    }

    private void populateQuestions()
    {
        LoadContext<Questionnaire> loadContext = LoadContext.create(Questionnaire.class);
        loadContext.setQuery(new LoadContext.Query("select i from ocat_Questionnaire i "));


        List<Questionnaire> questions = dataManager.loadList(loadContext);
        System.out.println(questions.size());
        List<InterviewResponse> responses = new ArrayList<InterviewResponse>();
        CommitContext context = new CommitContext();
        context.addInstanceToCommit(getEditedEntity());
        for( Questionnaire question : questions )
        {
            InterviewResponse response = new InterviewResponse();
            response.setInterview(this.getEditedEntity());
            response.setQuestion(question);
            responses.add(response);
            context.addInstanceToCommit(response);
        }
        dataManager.commit(context);
        interviewResponses.setItems(responses);
    }
}