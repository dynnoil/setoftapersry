package com.dynnoil.ui.pages;

import com.dynnoil.store.order.Order;
import org.apache.tapestry5.annotations.SessionState;

/**
 * Created by krukov on 06.10.2015.
 */
public class ViewOrder {

    @SessionState
    private Order usersOrder;

    Object onAddGood() {
        usersOrder.addGood("smetana");
        usersOrder.addGood("kapusta");
        return CheckOut.class;
    }
}