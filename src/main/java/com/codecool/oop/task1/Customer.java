package com.codecool.oop.task1;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString
public abstract class Customer {
    private int id;
    private String name;
    private double moneySpentInLastMonth;

    abstract double calculateFee();
}
