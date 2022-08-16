package com.codecool.oop.task1;

public class PremiumCustomer extends Customer {
    public PremiumCustomer(int id, String name, double spent) {
        super(id, name, spent);
    }

    @Override
    double calculateFee() {
        return 150 - Math.min(getMoneySpentInLastMonth() * 0.3, 100);
    }
}
