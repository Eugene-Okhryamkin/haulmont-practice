package com.haulmont.okhryamkin.rentservice.screen.outlet;

import io.jmix.ui.screen.*;
import com.haulmont.okhryamkin.rentservice.entity.Outlet;

@UiController("Outlet.browse")
@UiDescriptor("outlet-browse.xml")
@LookupComponent("outletsTable")
public class OutletBrowse extends StandardLookup<Outlet> {
}