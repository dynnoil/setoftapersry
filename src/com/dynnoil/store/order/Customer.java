package com.dynnoil.store.order;

import org.apache.tapestry5.annotations.Property;
import org.apache.tapestry5.beaneditor.NonVisual;
import org.apache.tapestry5.beaneditor.Validate;

import java.io.Serializable;
import java.util.Random;

/**
 * Created by krukov on 16.10.2015.
 */
public class Customer implements Serializable {

    @NonVisual
    private int id;

    @Validate("maxlength=10")
    private String name;

    @Validate("maxlength=20")
    private String familyName;

    private double spentCash;

    private static String[] names = new String[]{
            "Igor",
            "Vashya",
            "Petya",
            "Sanya",
            "Sonya",
            "Vitya",
            "Hohot"
    };


    private static String[] familyNames = new String[]{
            "Petrov",
            "Ashin",
            "Gordon",
            "Retrov",
            "Gorbunov",
            "Chashnikov",
            "Hobbit"
    };

    public Customer() {
        id = this.hashCode() * new Random().nextInt();
        name = names[new Random().nextInt(names.length - 1)];
        familyName = familyNames[new Random().nextInt(familyNames.length - 1)];
        spentCash = new Random().nextDouble() * 100 + 1.25;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public String getSpentCash() {
        return String.format("%.2f", spentCash);
    }

    public void setSpentCash(double spentCash) {
        this.spentCash = spentCash;
    }

}
