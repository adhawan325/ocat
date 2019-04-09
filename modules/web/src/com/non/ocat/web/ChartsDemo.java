package com.non.ocat.web;

import com.haulmont.cuba.core.global.AppBeans;
import com.haulmont.cuba.core.global.UserSessionSource;
import com.haulmont.cuba.gui.screen.Screen;
import com.haulmont.cuba.gui.screen.Subscribe;
import com.haulmont.cuba.gui.screen.UiController;
import com.haulmont.cuba.gui.screen.UiDescriptor;

@UiController("ocat_ChartsDemo")
@UiDescriptor("charts-demo.xml")
public class ChartsDemo extends Screen {

    @Subscribe
    protected void onBeforeShow(BeforeShowEvent event) {

        getScreenData().loadAll();
         }
}