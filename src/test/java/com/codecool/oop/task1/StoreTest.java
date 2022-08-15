package com.codecool.oop.task1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.codecool.oop.task1.CustomerType.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class StoreTest {
    Customer newCustomer;
    Customer discountCustomer;
    Customer loyalCustomer;
    Customer premiumCustomer;
    Store store = new Store();
    Customer premiumSpenderCustomer;

    @BeforeEach
    void setup() {
        newCustomer = new Customer(1, "Abel", 10, NEW);
        discountCustomer = new Customer(2, "John", 10, DISCOUNT);
        loyalCustomer = new Customer(3, "Baron", 10, LOYAL);
        premiumCustomer = new Customer(4, "Lord", 10, PREMIUM);
        premiumSpenderCustomer = new Customer(4, "Lord", 200, PREMIUM);
    }

    @Test
    void calculateCustomerFeesForNew() {
        store.addCustomer(newCustomer);
        assertEquals(26.0, store.calculateCustomerFees());
    }

    @Test
    void calculateCustomerFeesForDiscont() {
        store.addCustomer(discountCustomer);
        assertEquals(25.1, store.calculateCustomerFees());
    }

    @Test
    void calculateCustomerFeesForLoyal() {
        store.addCustomer(loyalCustomer);
        assertEquals(20.0, store.calculateCustomerFees());
    }

    @Test
    void calculateCustomerFeesForPremium() {
        store.addCustomer(premiumCustomer);
        assertEquals(147.0, store.calculateCustomerFees());
    }

    @Test
    void calculateCustomerFeesForPremiumSpender() {
        store.addCustomer(premiumSpenderCustomer);
        assertEquals(90., store.calculateCustomerFees());
    }
}
