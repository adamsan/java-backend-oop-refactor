package com.codecool.oop.task1;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private List<Customer> customers = new ArrayList<>();

    public void addCustomer(Customer c) {
        customers.add(c);
    }

    public double calculateCustomerFees() {
        double sum = 0;
        for (Customer customer : customers) {
            sum += customer.calculateFee();
        }
        return sum;
    }
}
