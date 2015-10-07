package com.dynnoil.ui.pages;

import com.dynnoil.store.order.Order;
import com.sun.net.httpserver.Authenticator;
import com.sun.xml.internal.ws.api.PropertySet;
import org.apache.tapestry5.annotations.InjectComponent;
import org.apache.tapestry5.annotations.Persist;
import org.apache.tapestry5.annotations.Property;
import org.apache.tapestry5.annotations.SessionState;
import org.apache.tapestry5.beaneditor.Validate;
import org.apache.tapestry5.corelib.components.Form;


import javax.inject.Inject;


/**
 * Created by krukov on 06.10.2015.
 */
public class ViewOrder {

    private boolean usersOrderExists;

    @SessionState
    private Order usersOrder;

    @Property
    @Persist
    @Validate("required")
    private String good;

    @InjectComponent
    private Form shopForm;

    @Inject
    private Authenticator authenticator;





}