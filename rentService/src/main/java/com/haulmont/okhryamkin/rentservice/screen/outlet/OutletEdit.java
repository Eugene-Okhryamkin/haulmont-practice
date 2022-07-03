package com.haulmont.okhryamkin.rentservice.screen.outlet;

import io.jmix.ui.screen.*;
import com.haulmont.okhryamkin.rentservice.entity.Outlet;

@UiController("Outlet.edit")
@UiDescriptor("outlet-edit.xml")
@EditedEntityContainer("outletDc")
public class OutletEdit extends StandardEditor<Outlet> {
}