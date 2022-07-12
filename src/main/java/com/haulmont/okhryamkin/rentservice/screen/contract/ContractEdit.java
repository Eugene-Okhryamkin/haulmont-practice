package com.haulmont.okhryamkin.rentservice.screen.contract;

import com.haulmont.okhryamkin.rentservice.app.ContractService;
import io.jmix.core.Messages;
import io.jmix.ui.Notifications;
import io.jmix.ui.component.Button;
import io.jmix.ui.component.NotificationFacet;
import io.jmix.ui.screen.*;
import com.haulmont.okhryamkin.rentservice.entity.Contract;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

@UiController("Contract.edit")
@UiDescriptor("contract-edit.xml")
@EditedEntityContainer("contractDc")
public class ContractEdit extends StandardEditor<Contract> {

    private static final Logger log = org.slf4j.LoggerFactory.getLogger(ContractEdit.class);
    @Autowired
    private ContractService contractService;

    @Autowired
    private Messages messages;

    @Autowired
    private Notifications notifications;

    @Autowired
    private MessageBundle messageBundle;

    @Subscribe
    public void onBeforeCommitChanges(BeforeCommitChangesEvent event) {
        if(!contractService.clientValidate(getEditedEntity())) {
            showNotification(messages.getMessage("com.haulmont.okhryamkin.rentservice.screen.contract/invalidContract"), messages.getMessage("com.haulmont.okhryamkin.rentservice.screen.contract/invalidContractDescription"));
            event.preventCommit();
        }
    }


    private void showNotification(String captionPath, String descriptionPath) {
        notifications.create(Notifications.NotificationType.ERROR)
                .withCaption(messageBundle.getMessage(captionPath))
                .withDescription(messageBundle.getMessage(descriptionPath))
                .withPosition(Notifications.Position.BOTTOM_RIGHT)
                .show();
    }
    
    
}