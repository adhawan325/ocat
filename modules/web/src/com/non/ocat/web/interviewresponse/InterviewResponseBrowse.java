package com.non.ocat.web.interviewresponse;

import com.haulmont.cuba.gui.screen.*;
import com.non.ocat.entity.InterviewResponse;

@UiController("ocat_InterviewResponse.browse")
@UiDescriptor("interview-response-browse.xml")
@LookupComponent("interviewResponsesTable")
@LoadDataBeforeShow
public class InterviewResponseBrowse extends StandardLookup<InterviewResponse> {
}