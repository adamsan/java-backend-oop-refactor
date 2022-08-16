package com.codecool.oop.task1;

public class DiscountCustomer extends Customer {
    public DiscountCustomer(int id, String name, double spent) {
        super(id, name, spent);
    }

    @Override
    double calculateFee() {
        return 25. + Math.min(getMoneySpentInLastMonth() * 0.01, 10);
    }
}
