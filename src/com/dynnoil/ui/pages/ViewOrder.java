package com.dynnoil.ui.pages;

import com.dynnoil.store.order.Order;
import org.apache.tapestry5.annotations.Property;
import org.apache.tapestry5.annotations.SessionState;

import java.util.Arrays;
import java.util.List;

/**
 * Created by krukov on 06.10.2015.
 */
public class ViewOrder {

    private boolean usersOrderExists;

    @SessionState
    private Order usersOrder;

    @Property
    private String good;

    public List<String> getOptions() {
        return Arrays.asList("Butter", "Bread", "Juice", "Shit", "all");
    }

    void onSuccess() {
        usersOrder.addGood(good);
    }
}