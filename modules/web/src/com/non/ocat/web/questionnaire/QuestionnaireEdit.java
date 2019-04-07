package com.non.ocat.web.questionnaire;

import com.haulmont.cuba.gui.screen.*;
import com.non.ocat.entity.Questionnaire;

@UiController("ocat_Questionnaire.edit")
@UiDescriptor("questionnaire-edit.xml")
@EditedEntityContainer("questionnaireDc")
@LoadDataBeforeShow
public class QuestionnaireEdit extends StandardEditor<Questionnaire> {
}