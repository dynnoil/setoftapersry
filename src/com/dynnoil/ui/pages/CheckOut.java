package com.dynnoil.ui.pages;

import com.dynnoil.store.order.Address;
import com.dynnoil.store.order.Order;
import com.dynnoil.ui.services.AppModule;
import org.apache.tapestry5.annotations.Persist;
import org.apache.tapestry5.annotations.Property;
import org.apache.tapestry5.annotations.SessionState;
import org.apache.tapestry5.corelib.components.BeanEditForm;
import org.apache.tapestry5.ioc.annotations.Inject;
import org.apache.tapestry5.ioc.annotations.InjectService;

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
     * Address to ship to
     */
    @Property
    private Address address;

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

    @Property
    @Persist
    private Long numberOfCreditCard;

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
        address = usersOrder.getShippingAddress();
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