package com.non.ocat.web.interviewconfig;

import com.haulmont.cuba.gui.screen.*;
import com.non.ocat.entity.InterviewConfig;

@UiController("ocat_InterviewConfig.browse")
@UiDescriptor("interview-config-browse.xml")
@LookupComponent("interviewConfigsTable")
@LoadDataBeforeShow
public class InterviewConfigBrowse extends StandardLookup<InterviewConfig> {
}