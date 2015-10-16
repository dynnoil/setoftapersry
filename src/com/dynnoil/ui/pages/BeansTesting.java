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
     * Комментарий, касаемый использования AJAX:
     * в темплете данной страницы у компонента grid есть параметр inPlace {true:false},
     * который позволяет использовать XMLHttpRequest, тем самым не вызывая метод ниже,
     * т. е. не обовновляя страницу полностью (в нашем случае не переходя на другую)
     *
     * @return
     */
    Object onAction() {
        return OrderPage.class;
    }
}