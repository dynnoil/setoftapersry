package com.dynnoil.ui.components;

import org.apache.tapestry5.BindingConstants;
import org.apache.tapestry5.MarkupWriter;
import org.apache.tapestry5.annotations.Component;
import org.apache.tapestry5.annotations.Parameter;
import org.apache.tapestry5.corelib.components.Label;
import org.apache.tapestry5.corelib.components.TextField;

/**
 * Created by krukov on 14.10.2015.
 */
public class InputFields {

    @Parameter(required = true)
    private String[] labels;

    private int countOfLabels;

    private int indexOfLabel;

    void setupRender() {
        countOfLabels = labels.length;
        indexOfLabel = 0;
    }

    void beginRender(MarkupWriter writer) {
        writer.element("textfield", "value", labels[indexOfLabel]);
    }

    boolean afterRender(MarkupWriter writer) {
        writer.end();
        countOfLabels--;
        return countOfLabels > 0
                ? false
                : true;
    }
}