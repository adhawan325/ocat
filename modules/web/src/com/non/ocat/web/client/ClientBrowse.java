package com.non.ocat.web.client;

import com.haulmont.cuba.gui.screen.*;
import com.non.ocat.entity.Client;

@UiController("ocat_Client.browse")
@UiDescriptor("client-browse.xml")
@LookupComponent("clientsTable")
@LoadDataBeforeShow
public class ClientBrowse extends StandardLookup<Client> {
}