package com.dynnoil.store.order;

import org.apache.tapestry5.annotations.Property;
import org.apache.tapestry5.beaneditor.DataType;

import java.io.Serializable;

/**
 * Created by krukov on 07.10.2015.
 */
public class User implements Serializable {


    @Property
    private String name;

    @Property
    private String password;

    @Property
    private boolean rememberMe;

    public  User() { }

}
