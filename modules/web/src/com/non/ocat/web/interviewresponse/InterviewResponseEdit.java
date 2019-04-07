package com.non.ocat.web.interviewresponse;

import com.haulmont.cuba.gui.screen.*;
import com.non.ocat.entity.InterviewResponse;

@UiController("ocat_InterviewResponse.edit")
@UiDescriptor("interview-response-edit.xml")
@EditedEntityContainer("interviewResponseDc")
@LoadDataBeforeShow
public class InterviewResponseEdit extends StandardEditor<InterviewResponse> {
}