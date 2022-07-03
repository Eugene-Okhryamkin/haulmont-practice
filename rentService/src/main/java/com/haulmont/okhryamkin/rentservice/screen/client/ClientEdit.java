package com.haulmont.okhryamkin.rentservice.screen.client;

import io.jmix.ui.screen.*;
import com.haulmont.okhryamkin.rentservice.entity.Client;

@UiController("Client.edit")
@UiDescriptor("client-edit.xml")
@EditedEntityContainer("clientDc")
public class ClientEdit extends StandardEditor<Client> {
}