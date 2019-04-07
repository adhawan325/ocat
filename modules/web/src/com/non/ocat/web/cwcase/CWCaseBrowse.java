package com.non.ocat.web.cwcase;

import com.haulmont.cuba.gui.screen.*;
import com.non.ocat.entity.CWCase;

@UiController("ocat_CWCase.browse")
@UiDescriptor("cw-case-browse.xml")
@LookupComponent("cWCasesTable")
@LoadDataBeforeShow
public class CWCaseBrowse extends StandardLookup<CWCase> {
}