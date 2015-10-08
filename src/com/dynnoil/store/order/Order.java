package com.dynnoil.store.order;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Class presents lite version of users's order in Internet store
 *
 * Created by krukov on 06.10.2015.
 */
public class Order implements Serializable {

    /**
     * ID of order
     */
    private int ID;

    /**
     * List of ordered goods
     */
    private ArrayList<Goods> goods;

    /**
     * Good's price
     */
    final private double PRICE = 100;

    /**
     * Total price for order
     */
    private double total;

    /**
     * Current date of order
     */
    private Date currentDate;

    /**
     * Recieved date of order
     */
    private Date recievedDate;

    /**
     * Default constructor
     */
    public Order() {
        this.ID = this.hashCode();
        this.goods = new ArrayList<Goods>();
        this.total = 0;
        this.currentDate = new Date();
    }

    /**
     * Method for adding good to order
     *
     * @param goods
     */
    public void addGoods(ArrayList<Goods> goods) {
        this.goods.addAll(goods);
        this.total = PRICE * goods.size();
    }

    /**
     * Method for getting array of ordered
     * goods in String
     *
     * @return string array of ordered goods
     */
    public String[] getGoods() {
        String[] totalGoods = new String[goods.size()];
        for (int i = 0; i < totalGoods.length; i++) {
            totalGoods[i] = goods.get(i).toString();
        }
        return totalGoods;
    }

    /**
     * Getter of order's ID
     *
     * @return ID
     */
    public int getID() {
        return ID;
    }

    /**
     * Getter of a total order's price
     *
     * @return total price
     */
    public double getTotal() {
        return total;
    }

    /**
     * Getter of order's date
     *
     * @return order's currentDate
     */
    public Date getCurrentDate() {
        return currentDate;
    }

    /**
     * Setter of orders's recieved date
     *
     * @param recievedDate
     */
    public void setRecievedDate(Date recievedDate) {
        this.recievedDate = recievedDate;
    }

    /**
     * Getter of order's recieved date
     *
     * @return
     */
    public Date getRecievedDate() {
        return this.recievedDate;
    }

    public void removeGoods() {
        for (int  i = 0; i < goods.size(); i++ ) {
            goods.remove(i);
        }
    }

}
