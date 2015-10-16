package com.dynnoil.ui.pages;

import org.apache.tapestry5.annotations.Persist;
import org.apache.tapestry5.annotations.Property;

/**
 * Created by krukov on 16.10.2015.
 */
public class AjaxSamples {

    @Property(read=false)
    @Persist
    private String edit;

    public String getEdit() {
        return edit == null
                ? "Please click here"
                : edit;
    }
}