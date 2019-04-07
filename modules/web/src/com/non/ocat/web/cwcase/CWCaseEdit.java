package com.non.ocat.web.cwcase;

import com.haulmont.cuba.gui.screen.*;
import com.non.ocat.entity.CWCase;

@UiController("ocat_CWCase.edit")
@UiDescriptor("cw-case-edit.xml")
@EditedEntityContainer("cWCaseDc")
@LoadDataBeforeShow
public class CWCaseEdit extends StandardEditor<CWCase> {
}