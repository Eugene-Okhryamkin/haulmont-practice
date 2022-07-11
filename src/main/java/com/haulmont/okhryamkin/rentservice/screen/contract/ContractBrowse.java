package com.haulmont.okhryamkin.rentservice.screen.contract;

import com.haulmont.okhryamkin.rentservice.app.ContractService;
import io.jmix.ui.action.Action;
import io.jmix.ui.model.CollectionContainer;
import io.jmix.ui.screen.*;
import com.haulmont.okhryamkin.rentservice.entity.Contract;
import org.springframework.beans.factory.annotation.Autowired;

@UiController("Contract.browse")
@UiDescriptor("contract-browse.xml")
@LookupComponent("contractsTable")
public class ContractBrowse extends StandardLookup<Contract> {

}