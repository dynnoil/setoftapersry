package com.dynnoil.ui.pages;

import com.dynnoil.store.order.Address;
import org.apache.tapestry5.annotations.Persist;
import org.apache.tapestry5.annotations.Property;

/**
 * Created by krukov on 08.10.2015.
 */
public class ShippingPage {

    @Property
    private Address billingAddress;

    @Property
    private Address shippingAddress;

    @Property
    @Persist
    private boolean shipToAnotherAddress;

    void onPrepare() {
        billingAddress = new Address();
        shippingAddress = new Address();
    }

}