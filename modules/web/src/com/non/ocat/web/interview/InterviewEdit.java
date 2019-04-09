package com.non.ocat.web.interview;

import com.haulmont.cuba.core.entity.Entity;
import com.haulmont.cuba.core.global.*;
import com.haulmont.cuba.gui.components.Label;
import com.haulmont.cuba.gui.components.PickerField;
import com.haulmont.cuba.gui.components.Table;
import com.haulmont.cuba.gui.components.TextField;
import com.haulmont.cuba.gui.model.CollectionContainer;
import com.haulmont.cuba.gui.model.CollectionLoader;
import com.haulmont.cuba.gui.screen.*;
import com.haulmont.cuba.security.entity.User;
import com.haulmont.cuba.web.gui.components.table.TableItemPropertyWrapper;
import com.haulmont.cuba.web.sys.SideMenuBuilder;
import com.non.ocat.entity.Interview;
import com.non.ocat.entity.InterviewResponse;
import com.non.ocat.entity.Questionnaire;
import com.non.ocat.entity.ResponseTypeConfig;

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
    private CollectionContainer<InterviewResponse> generalInformationInterviewResponses;
    @Inject
    private Label<String> preamble;
    @Inject
    private CollectionLoader<InterviewResponse> generalInformationInterviewResponsesDl;
    @Inject
    private CollectionLoader<InterviewResponse> learningNeedsInterviewResponsesDl;
    @Inject
    private CollectionContainer<InterviewResponse> learningNeedsInterviewResponses;

    @Inject
    private TextField<User> interviewerField;

    @Subscribe
    protected void onInitEntity(InitEntityEvent<Interview> event) {
        generalInformationInterviewResponses.setItems(populateQuestions("tabGeneralInformation", true));
        learningNeedsInterviewResponses.setItems(populateQuestions("tabLearningNeeds", false));
    }


    @Subscribe
    protected void onBeforeShow(BeforeShowEvent event) {
        generalInformationInterviewResponsesDl.setParameter("id", getEditedEntity());
        generalInformationInterviewResponsesDl.setParameter("itemCode", "tabGeneralInformation");
        interviewerField.setValue(AppBeans.get(UserSessionSource.class).getUserSession().getUser());
        learningNeedsInterviewResponsesDl.setParameter("id", getEditedEntity());
        learningNeedsInterviewResponsesDl.setParameter("itemCode", "tabLearningNeeds");
        getScreenData().loadAll();
        preamble.setHtmlEnabled(true);
        preamble.setValue("<h1> Please ensure that the client has received a copy of the OCAT Rights and Privacy Overview Form </h1>");
    }

    private List<InterviewResponse> populateQuestions(String tab, boolean isFirst)
    {
        LoadContext<Questionnaire> loadContext = LoadContext.create(Questionnaire.class);
        loadContext.setQuery(new LoadContext.Query("select i from ocat_Questionnaire i where i.interviewSection.itemCode = :itemCode").setParameter("itemCode", tab));
        List<Questionnaire> questions = dataManager.loadList(loadContext);
        List<InterviewResponse> responses = new ArrayList<InterviewResponse>();

        LoadContext<ResponseTypeConfig> responseTypeConfigLoadContext = LoadContext.create(ResponseTypeConfig.class);
        responseTypeConfigLoadContext.setQuery(new LoadContext.Query("select x from ocat_ResponseTypeConfig x where x.configCode = :configCode").setParameter("configCode", "notAnswered" ));
        ResponseTypeConfig defaultResponse = dataManager.load(responseTypeConfigLoadContext);
        CommitContext context = new CommitContext();
        if( isFirst )
        {
            getEditedEntity().setInterviewer(AppBeans.get(UserSessionSource.class).getUserSession().getUser());
            context.addInstanceToCommit(getEditedEntity());
        }
        for( Questionnaire question : questions )
        {
            InterviewResponse response = new InterviewResponse();
            response.setInterview(this.getEditedEntity());
            response.setQuestion(question);
            response.setResponse(defaultResponse);
            responses.add(response);
            context.addInstanceToCommit(response);
        }
        dataManager.commit(context);
        return responses;
    }
}