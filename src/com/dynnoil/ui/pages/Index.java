package com.dynnoil.ui.pages;

import org.apache.tapestry5.annotations.*;
import org.apache.tapestry5.corelib.components.Form;
import org.apache.tapestry5.services.PageRenderLinkSource;

import java.sql.Time;
import java.util.Date;

/**
 * Created by krukov on 03.10.2015.
 */
public class Index {
    /*
    Object onNavigateGoRead() {
        return Read.class;
    }
    */

    @InjectPage
    private ForTesting test;

    Object onActionFromToTest() {
        test.testVar = "Some";
        return this.test;
    }

    /*
    String onNavigateGoSomePage() {
        return "SomePage";
    }
    */

}