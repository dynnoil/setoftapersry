package com.dynnoil.ui.pages;

import com.dynnoil.store.order.Goods;
import com.dynnoil.store.order.Order;
import org.apache.tapestry5.annotations.Property;
import org.apache.tapestry5.annotations.SessionState;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by krukov on 06.10.2015.
 */

public class CheckOut {


    /**
     * SSO of Order class
     */
    @SessionState
    private Order usersOrder;

    /**
     * Order's ID
     */
    @Property
    private int ID;

    /**
     * Order's current currentDate
     */
    @Property
    private Date currentDate;

    /**
     * Order's recieved date
     */
    @Property
    private Date recievedDate;

    /**
     * Total order's sum
     */
    @Property
    private double totalSum;

    /**
     * List of user's goods
     */
    @Property
    private String[] goods;

    void pageLoaded() {
        onActivate();
    }


    void onActivate() {
        ID = usersOrder.getID();
        currentDate = usersOrder.getCurrentDate();
        recievedDate = usersOrder.getRecievedDate();
        totalSum = usersOrder.getTotal();
        goods = usersOrder.getGoods();
    }

    Object onSuccess() {
        return ForTesting.class;
    }

    Object onBack() {
        return OrderPage.class;
    }


}