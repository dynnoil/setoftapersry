package com.dynnoil.ui.components;

import org.apache.tapestry5.annotations.Property;

import java.util.Date;

/**
 * Created by krukov on 13.10.2015.
 */
public class TimeTable {

    @Property
    private Date date;

    void setupRender() {
        date = new Date();
    }

}