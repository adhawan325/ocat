package com.non.ocat.web.casestatusconfig;

import com.haulmont.cuba.gui.screen.*;
import com.non.ocat.entity.CaseStatusConfig;

@UiController("ocat_CaseStatusConfig.browse")
@UiDescriptor("case-status-config-browse.xml")
@LookupComponent("table")
@LoadDataBeforeShow
public class CaseStatusConfigBrowse extends MasterDetailScreen<CaseStatusConfig> {
}