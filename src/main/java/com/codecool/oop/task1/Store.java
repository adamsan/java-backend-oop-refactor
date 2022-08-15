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
            sum += calculateFee(customer);
        }
        return sum;
    }

    private double calculateFee(Customer customer) {
        return switch (customer.getType()) {
            case NEW -> 25.0 + Math.min(customer.getMoneySpentInLastMonth() * 0.1, 10);
            case DISCOUNT -> 25. + Math.min(customer.getMoneySpentInLastMonth() * 0.01, 10);
            case LOYAL -> 20;
            case PREMIUM -> 150 - Math.min(customer.getMoneySpentInLastMonth() * 0.3, 100);
        };
    }
}
