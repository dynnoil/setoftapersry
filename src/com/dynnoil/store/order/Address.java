package com.dynnoil.store.order;

/**
 * Created by krukov on 08.10.2015.
 */
public class Address {

    /**
     * The name of the shipping street
     */
    private String street;

    /**
     * The name of the city
     */
    private String city;

    /**
     * Zip code of shipping place
     */
    private Long zipCode;

    public String getStreet() {
        return this.street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Long getZipCode() {
        return this.zipCode;
    }

    public void setZipCode(Long zipCode) {
        this.zipCode = zipCode;
    }

}
