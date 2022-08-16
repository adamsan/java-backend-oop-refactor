package com.codecool.oop.task2;

import static com.codecool.oop.task2.GildedRose.*;
import static com.codecool.oop.task2.GildedRose.AGED_BRIE;

public class Item {

    public String name;

    public int sellIn;

    public int quality;

    protected Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

    public static Item create(String name, int sellIn, int quality) {
        return switch (name) {
            case AGED_BRIE -> new AgedBrieItem(name, sellIn, quality);
            case BACKSTAGE -> new BackStageItem(name, sellIn, quality);
            case SULFURAS -> new SulfarasItem(name, sellIn, quality);
            default -> new Item(name, sellIn, quality);
        };
//        return new Item(name, sellIn, quality);
    }

    @Override
    public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }
}
