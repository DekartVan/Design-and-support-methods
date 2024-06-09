package com.company.bpmdemo.web.screens.contract;

import com.haulmont.cuba.gui.screen.*;
import com.company.bpmdemo.entity.Contract;

@UiController("bpmdemo_Contract.browse")
@UiDescriptor("contract-browse.xml")
@LookupComponent("contractsTable")
@LoadDataBeforeShow
public class ContractBrowse extends StandardLookup<Contract> {
}