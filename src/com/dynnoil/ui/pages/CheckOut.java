package com.dynnoil.ui.pages;

import com.dynnoil.store.order.Order;
import com.sun.xml.internal.ws.api.PropertySet;
import org.apache.tapestry5.annotations.Persist;
import org.apache.tapestry5.annotations.Property;
import org.apache.tapestry5.annotations.SessionState;

/**
 * Created by krukov on 06.10.2015.
 */
public class CheckOut {


    @SessionState
    private Order checkOut;


    @Property
    private int ID = checkOut.getID();


    @Property
    private double sum = checkOut.getSummary();

    @Property
    private String[] goods = checkOut.getGoods();

}