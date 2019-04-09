package com.non.ocat.web.main;

import com.haulmont.cuba.core.global.GlobalConfig;
import com.haulmont.cuba.gui.components.LinkButton;
import com.haulmont.cuba.gui.components.LookupField;
import com.haulmont.cuba.gui.components.SplitPanel;
import com.haulmont.cuba.gui.components.mainwindow.AppWorkArea;
import com.haulmont.cuba.gui.components.mainwindow.SideMenu;
import com.haulmont.cuba.gui.screen.Subscribe;
import com.haulmont.cuba.web.AppUI;
import com.haulmont.cuba.web.app.mainwindow.AppMainWindow;
import com.haulmont.cuba.web.sys.RedirectHandler;
import com.haulmont.cuba.web.widgets.CubaHorizontalSplitPanel;

import javax.inject.Inject;
import java.util.List;
import java.util.Locale;

public class ExtAppMainWindow extends AppMainWindow {

    @Inject
    private AppWorkArea workArea1;

}

