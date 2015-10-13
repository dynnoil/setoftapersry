package com.dynnoil.store.order;

import org.apache.tapestry5.annotations.Property;
import org.apache.tapestry5.beaneditor.DataType;

/**
 * Created by krukov on 07.10.2015.
 */
public class User {


    @Property
    private String name;

    @Property
    private String password;

    @Property
    private boolean rememberMe;

    public  User() { }

}
