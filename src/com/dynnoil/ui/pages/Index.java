package com.dynnoil.ui.pages;

import com.dynnoil.store.order.Customer;
import com.dynnoil.store.order.Order;
import com.dynnoil.ui.mixins.CkEditor;
import com.dynnoil.ui.services.AppModule;
import org.apache.tapestry5.PersistenceConstants;
import org.apache.tapestry5.annotations.*;
import org.apache.tapestry5.corelib.components.TextArea;
import org.apache.tapestry5.ioc.annotations.Inject;

import java.util.*;

/**
 * Created by krukov on 03.10.2015.
 */
public class Index {

    Object onOrderPage() {
        return OrderPage.class;
    }
}