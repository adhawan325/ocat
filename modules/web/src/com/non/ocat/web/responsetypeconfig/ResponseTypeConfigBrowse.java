package com.non.ocat.web.responsetypeconfig;

import com.haulmont.cuba.gui.screen.*;
import com.non.ocat.entity.ResponseTypeConfig;

@UiController("ocat_ResponseTypeConfig.browse")
@UiDescriptor("response-type-config-browse.xml")
@LookupComponent("table")
@LoadDataBeforeShow
public class ResponseTypeConfigBrowse extends MasterDetailScreen<ResponseTypeConfig> {
}