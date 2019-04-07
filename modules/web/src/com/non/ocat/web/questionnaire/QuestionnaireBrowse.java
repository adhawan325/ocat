package com.non.ocat.web.questionnaire;

import com.haulmont.cuba.gui.screen.*;
import com.non.ocat.entity.Questionnaire;

@UiController("ocat_Questionnaire.browse")
@UiDescriptor("questionnaire-browse.xml")
@LookupComponent("questionnairesTable")
@LoadDataBeforeShow
public class QuestionnaireBrowse extends StandardLookup<Questionnaire> {
}