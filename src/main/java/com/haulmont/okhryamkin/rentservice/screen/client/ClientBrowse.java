package com.haulmont.okhryamkin.rentservice.screen.client;

import io.jmix.ui.screen.*;
import com.haulmont.okhryamkin.rentservice.entity.Client;

@UiController("Client.browse")
@UiDescriptor("client-browse.xml")
@LookupComponent("clientsTable")
public class ClientBrowse extends StandardLookup<Client> {
}