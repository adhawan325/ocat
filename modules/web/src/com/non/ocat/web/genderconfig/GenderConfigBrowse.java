package com.non.ocat.web.genderconfig;

import com.haulmont.cuba.gui.screen.*;
import com.non.ocat.entity.GenderConfig;

@UiController("ocat_GenderConfig.browse")
@UiDescriptor("gender-config-browse.xml")
@LookupComponent("table")
@LoadDataBeforeShow
public class GenderConfigBrowse extends MasterDetailScreen<GenderConfig> {
}