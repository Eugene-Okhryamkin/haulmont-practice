package com.haulmont.okhryamkin.rentservice.screen.contract;

import io.jmix.ui.screen.*;
import com.haulmont.okhryamkin.rentservice.entity.Contract;

@UiController("Contract.browse")
@UiDescriptor("contract-browse.xml")
@LookupComponent("contractsTable")
public class ContractBrowse extends StandardLookup<Contract> {
}