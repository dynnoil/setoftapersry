package com.dynnoil.ui.pages;

import com.dynnoil.ui.services.AppModule;
import org.apache.tapestry5.PersistenceConstants;
import org.apache.tapestry5.annotations.*;
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
    @Persist(PersistenceConstants.SESSION)
    private Integer randomNumber;

    Object onOrderPage() {
        return OrderPage.class;
    }


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

    /**
     * Method allows you
     * to reset page state
     */
    void pageReset() {
        currentDate = null;
    }



}