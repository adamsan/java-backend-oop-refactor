package com.codecool.oop.task1;

public class NewCustomer extends Customer {
    public NewCustomer(int id, String name, double spent) {
        super(id, name, spent);
    }

    @Override
    double calculateFee() {
        return 25.0 + Math.min(getMoneySpentInLastMonth() * 0.1, 10);
    }
}
