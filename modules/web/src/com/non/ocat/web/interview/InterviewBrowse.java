package com.non.ocat.web.interview;

import com.haulmont.cuba.gui.screen.*;
import com.non.ocat.entity.Interview;

@UiController("ocat_Interview.browse")
@UiDescriptor("interview-browse.xml")
@LookupComponent("interviewsTable")
@LoadDataBeforeShow
public class InterviewBrowse extends StandardLookup<Interview> {
}