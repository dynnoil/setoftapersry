package com.dynnoil.ui.components;

import org.apache.tapestry5.Asset;
import org.apache.tapestry5.Block;
import org.apache.tapestry5.annotations.Path;
import org.apache.tapestry5.annotations.Property;
import org.apache.tapestry5.ioc.annotations.Inject;
import sun.org.mozilla.javascript.internal.EcmaError;

/**
 * Created by krukov on 16.10.2015.
 */
public class ProgressiveDisplayDemo {

    @Inject
    private Block dukeBlock;

    Object onProgressiveDisplayFromDisplayDuke() {
        delay(300);
        return dukeBlock;
    }

    private void delay(final int milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (final Exception e) {}
    }

}