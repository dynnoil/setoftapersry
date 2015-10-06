package com.dynnoil.ui.pages;

import org.apache.tapestry5.annotations.PageActivationContext;
import org.apache.tapestry5.annotations.Property;

/**
 * Created by krukov on 05.10.2015.
 */
public class ForTesting {

    String testVar;

    Integer index;

    public void setTestVar(String testVar) {
        this.testVar = testVar;
    }

    public String getTestVar() {
        return testVar;
    }

    Object onActionFromGoIndex() {
        return Index.class;
    }

    void onActivate(String testVar, Integer index) {
        this.testVar = testVar;
        this.index = index;
    }

    Object[] onPassivate() {
        return new Object[]{this.testVar, this.index};
    }
}