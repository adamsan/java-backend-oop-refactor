package com.codecool.oop.task2;

public class BackStageItem extends Item {
    public BackStageItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    void updateQuality() {
        sellIn--;
        if (sellIn <= 0) {
            quality = 0;
            return;
        }
        int maxQuality = 50;
        int qualityIncrease = 1;
        if(sellIn < 10) qualityIncrease = 2;
        if(sellIn < 5) qualityIncrease = 3;
        quality = Math.min(quality + qualityIncrease, maxQuality);
    }
}
