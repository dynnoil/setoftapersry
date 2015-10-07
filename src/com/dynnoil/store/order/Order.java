package com.dynnoil.store.order;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;


/**
 * Created by krukov on 06.10.2015.
 */
public class Order implements Serializable {

    private int ID;
    private LinkedList<String> buying;
    private double summary;

    public Order() {
        this.ID = this.hashCode();
        this.buying = new LinkedList<String>();
        this.summary = 0;
    }

    public void addGood(String good) {
        this.summary += 10;
        this.buying.add(good);
    }

    public String[] getGoods() {
        String[] total = new String[buying.size()];
        for (int i = 0; i < total.length; i++) {
            total[i] = buying.get(i);
        }
        return total;
    }

    public int getID() {
        return ID;
    }

    public double getSummary() {
        return summary;
    }

}
