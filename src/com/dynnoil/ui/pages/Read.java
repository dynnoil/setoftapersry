package com.dynnoil.ui.pages;

import org.apache.tapestry5.ValueEncoder;
import org.apache.tapestry5.annotations.ActivationRequestParameter;
import org.apache.tapestry5.annotations.Property;
import org.apache.tapestry5.ioc.annotations.Inject;

/**
 * Created by krukov on 05.10.2015.
 */
public class Read {

    @Property
    private String nameOfArticle;

    @Property
    private Long state;

    void onActivate(Long state, String nameOfArticle) {
        this.nameOfArticle = nameOfArticle;
        this.state = state;
    }


    Object[] onPassivate() {
        return new Object[] {this.state, this.nameOfArticle};
    }

}