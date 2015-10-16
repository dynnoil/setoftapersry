package com.dynnoil.ui.pages;

import com.dynnoil.store.order.Customer;
import org.apache.tapestry5.annotations.Property;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by krukov on 16.10.2015.
 */
public class BeansTesting {

    @Property
    private List<Customer> customers;

    void pageLoaded() {
        customers = new ArrayList<Customer>();
        for (int i = 0; i < 100; ++i) {
            customers.add(new Customer());
        }
    }

    void setupRender() {
    }

    /**
     * �����������, �������� ������������� AJAX:
     * � �������� ������ �������� � ���������� grid ���� �������� inPlace {true:false},
     * ������� ��������� ������������ XMLHttpRequest, ��� ����� �� ������� ����� ����,
     * �. �. �� ���������� �������� ��������� (� ����� ������ �� �������� �� ������)
     *
     * @return
     */
    Object onAction() {
        return OrderPage.class;
    }
}