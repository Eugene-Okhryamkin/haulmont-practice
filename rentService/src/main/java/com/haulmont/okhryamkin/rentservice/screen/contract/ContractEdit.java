package com.haulmont.okhryamkin.rentservice.screen.contract;

import io.jmix.ui.screen.*;
import com.haulmont.okhryamkin.rentservice.entity.Contract;

@UiController("Contract.edit")
@UiDescriptor("contract-edit.xml")
@EditedEntityContainer("contractDc")
public class ContractEdit extends StandardEditor<Contract> {
}