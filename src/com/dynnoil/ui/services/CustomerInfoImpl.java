package com.dynnoil.ui.services;

import java.util.Collection;

/**
 * Created by krukov on 19.10.2015.
 */
public class CustomerInfoImpl implements CustomerInfo {

    private Collection<String> phoneNumbers;

    public CustomerInfoImpl(Collection<String> configuration) {
        this.phoneNumbers = configuration;
    }

    public int getNumber() {
        return phoneNumbers.size();
    }
}
