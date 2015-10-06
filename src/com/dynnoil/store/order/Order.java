package com.dynnoil.store.order;

import java.io.Serializable;
import java.util.List;


/**
 * Created by krukov on 06.10.2015.
 */
public class Order implements Serializable {

    private int ID;
    private List<String> buying;
    private double summary;


    public Order() {
        this.ID = this.hashCode();
        this.buying = null;
        this.summary = 0;
    }

    public void addGood(String good) {
        buying.add(good);
        summary+=10;
    }

    public int getID() {
        return ID;
    }

    public double getSummary() {
        return summary;
    }

}
