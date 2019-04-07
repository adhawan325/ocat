package com.non.ocat.web.client;

import com.haulmont.cuba.gui.screen.*;
import com.non.ocat.entity.Client;

@UiController("ocat_Client.edit")
@UiDescriptor("client-edit.xml")
@EditedEntityContainer("clientDc")
@LoadDataBeforeShow
public class ClientEdit extends StandardEditor<Client> {
}