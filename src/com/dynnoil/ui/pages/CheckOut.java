package com.dynnoil.ui.pages;

import com.dynnoil.store.order.Goods;
import com.dynnoil.store.order.Order;
import org.apache.tapestry5.annotations.Property;
import org.apache.tapestry5.annotations.SessionState;
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

    /**
     * Stage of a page, which runs after
     * page's creation
     */
    void pageLoaded() {
        onActivate();
    }

    /**
     * Method runs when page's
     * starting to be active
     */
    void onActivate() {
        ID = usersOrder.getID();
        currentDate = usersOrder.getCurrentDate();
        recievedDate = usersOrder.getRecievedDate();
        totalSum = usersOrder.getTotal();
        goods = usersOrder.getGoods();
    }

    Object onSuccess() {
        return ShippingPage.class;
    }

    /**
     * Handler event method for
     * redirection to another page from
     * cache (if it exists) or by creating it
     * otherwise
     *
     * @return new page
     */
    Object onBack() {
        return OrderPage.class;
    }


}