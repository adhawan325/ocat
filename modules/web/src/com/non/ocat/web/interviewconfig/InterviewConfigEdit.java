package com.non.ocat.web.interviewconfig;

import com.haulmont.cuba.gui.screen.*;
import com.non.ocat.entity.InterviewConfig;

@UiController("ocat_InterviewConfig.edit")
@UiDescriptor("interview-config-edit.xml")
@EditedEntityContainer("interviewConfigDc")
@LoadDataBeforeShow
public class InterviewConfigEdit extends StandardEditor<InterviewConfig> {
}