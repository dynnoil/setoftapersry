package com.dynnoil.ui.pages;

import org.apache.tapestry5.annotations.Persist;
import org.apache.tapestry5.annotations.Property;

/**
 * Created by krukov on 16.10.2015.
 */
public class MixinsSamples {

    @Persist
    @Property
    private String content;
}