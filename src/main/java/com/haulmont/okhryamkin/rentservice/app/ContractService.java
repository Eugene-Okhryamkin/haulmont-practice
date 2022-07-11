package com.haulmont.okhryamkin.rentservice.app;

import com.haulmont.okhryamkin.rentservice.entity.Client;
import com.haulmont.okhryamkin.rentservice.entity.Contract;
import com.haulmont.okhryamkin.rentservice.entity.Outlet;
import io.jmix.core.DataManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;


@Service
public class ContractService {

    @Autowired
    private DataManager dataManager;

    public boolean clientValidate(Contract contract) {
        List<Contract> contractList = this.dataManager.load(Contract.class).all().list();

        for(Contract element : contractList) {
            if(element.getDateOfStart() == contract.getDateOfStart() && element.getDateOfEnd() == element.getDateOfEnd()) {
                return false;
            } else if(!(contract.getClient().equals(element.getClient()))) {
                return false;
            }

            return true;
        }

        return true;
    }

}