package com.dynnoil.ui.pages;

import org.apache.tapestry5.PersistenceConstants;
import org.apache.tapestry5.annotations.*;
import org.apache.tapestry5.corelib.components.Form;
import org.apache.tapestry5.services.PageRenderLinkSource;

import java.sql.Time;
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
    @Persist(PersistenceConstants.FLASH)
    private Integer randomNumber;

    @InjectPage
    private ForTesting test;

    Object onActionFromToTest() {
        test.testVar = "Some";
        return this.test;
    }

    void pageLoaded() {
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
    @DiscardAfter
    void onClean() { }

    /*
    void pageReset() {
        this.randomNumber = 0;
    }
    */


}