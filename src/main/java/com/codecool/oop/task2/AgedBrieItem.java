package com.codecool.oop.task2;

public class AgedBrieItem extends Item {
    public AgedBrieItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    void updateQuality() {
        int increaseQuality = sellIn <= 0 ? 2 : 1;
        int maxQuality = 50;
        quality = Math.min(maxQuality, quality + increaseQuality);
        sellIn--;
    }
}
