package com.dynnoil.ui.pages;

import com.dynnoil.store.order.Order;
import com.dynnoil.ui.mixins.CkEditor;
import com.dynnoil.ui.services.AppModule;
import org.apache.tapestry5.PersistenceConstants;
import org.apache.tapestry5.annotations.*;
import org.apache.tapestry5.corelib.components.TextArea;
import org.apache.tapestry5.ioc.annotations.Inject;

import java.util.Date;
import java.util.Random;

/**
 * Created by krukov on 03.10.2015.
 */
public class Index {


    private Date currentDate;
    private Integer hours;
    private Integer minutes;

    @Property
    private String[] labels;

    @Property
    private String content;





    @Property
    @Persist(PersistenceConstants.SESSION)
    private Integer randomNumber;

    Object onOrderPage() {
        return OrderPage.class;
    }

    @SessionState
    private Order usersOrder;

    void onActivate() {
        currentDate = new Date();
        hours = currentDate.getHours();
        minutes = currentDate.getMinutes();
    }

    public String getCurrentTime() {
        return hours.toString() + ":" + minutes.toString();
    }

    void onNextRandom() {
        randomNumber = new Random().nextInt();
    }

    void pageLoaded() {
        labels = new String[] {"Name","Password", "ConfirmPassword"};
        usersOrder = new Order();
    }

    /**
     * Method allows you
     * to reset page state
     */
    void pageReset() {
        currentDate = null;
    }




}