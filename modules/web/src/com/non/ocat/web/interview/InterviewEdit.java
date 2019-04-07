package com.non.ocat.web.interview;

import com.haulmont.cuba.gui.screen.*;
import com.non.ocat.entity.Interview;

@UiController("ocat_Interview.edit")
@UiDescriptor("interview-edit.xml")
@EditedEntityContainer("interviewDc")
@LoadDataBeforeShow
public class InterviewEdit extends StandardEditor<Interview> {
}