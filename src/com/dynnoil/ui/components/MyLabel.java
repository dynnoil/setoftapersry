package com.dynnoil.ui.components;

import org.apache.tapestry5.BindingConstants;
import org.apache.tapestry5.MarkupWriter;
import org.apache.tapestry5.annotations.Parameter;
import org.apache.tapestry5.annotations.Persist;
import org.apache.tapestry5.annotations.Property;

/**
 * Created by krukov on 14.10.2015.
 */
public class MyLabel {

    @Parameter(required = true, principal = true)
    @Property
    private String value;

    @Parameter(value = "1")
    private int times;

    @Persist
    private int countTimes;

    @Parameter(required = true, defaultPrefix = BindingConstants.LITERAL)
    private String element;

    void setupRender() {
        countTimes = times;
    }

    void beginRender(MarkupWriter writer) {
        writer.element(element);
    }

    boolean afterRender(MarkupWriter writer) {
        writer.end();
        countTimes--;
        return (countTimes > 0)
                ? false
                : true;
    }
}