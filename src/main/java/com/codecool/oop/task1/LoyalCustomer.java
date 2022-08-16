package com.codecool.oop.task1;

public class LoyalCustomer extends Customer {
    public LoyalCustomer(int id, String name, double spent) {
        super(id, name, spent);
    }

    @Override
    double calculateFee() {
        return 20;
    }
}
