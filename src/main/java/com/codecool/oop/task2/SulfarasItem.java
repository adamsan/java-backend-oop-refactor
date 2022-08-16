package com.codecool.oop.task2;

public class SulfarasItem extends Item {
    public SulfarasItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    void updateQuality() {
        // don't update quality for this item
    }
}
