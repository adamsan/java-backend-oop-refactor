package com.codecool.oop.task2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GildedRoseTest {

    @Test
    void updateQualityTest() {
        Item item = new Item("foo", 5, 10);
        var g = new GildedRose(new Item[]{item});
        g.updateQuality();
        assertEquals(4, item.sellIn);
        assertEquals(9, item.quality);
    }

    @Test
    void updateQualityTest2() {
        Item item = new Item("foo", 0, 10);
        var g = new GildedRose(new Item[]{item});
        g.updateQuality();
        assertEquals(-1, item.sellIn);
        assertEquals(8, item.quality);
    }

    @Test
    void updateQualityTestAgedBrie() {
        Item item = new Item("Aged Brie", 5, 10);
        var g = new GildedRose(new Item[]{item});
        g.updateQuality();
        assertEquals(4, item.sellIn);
        assertEquals(11, item.quality);
    }

    @Test
    void updateQualityTestAgedBrie2() {
        Item item = new Item("Aged Brie", 0, 10);
        var g = new GildedRose(new Item[]{item});
        g.updateQuality();
        assertEquals(-1, item.sellIn);
        assertEquals(12, item.quality);
    }

    @Test
    void updateQualityTestAgedBrie3() {
        Item item = new Item("Aged Brie", -1, 50);
        var g = new GildedRose(new Item[]{item});
        g.updateQuality();
        assertEquals(-2, item.sellIn);
        assertEquals(50, item.quality);
    }


    @Test
    void updateQualityTestBackStage() {
        Item item = new Item("Backstage passes to a TAFKAL80ETC concert", 5, 10);
        var g = new GildedRose(new Item[]{item});
        g.updateQuality();
        assertEquals(4, item.sellIn);
        assertEquals(13, item.quality);
    }

    @Test
    void updateQualityTestBackStage2() {
        Item item = new Item("Backstage passes to a TAFKAL80ETC concert", 0, 10);
        var g = new GildedRose(new Item[]{item});
        g.updateQuality();
        assertEquals(-1, item.sellIn);
        assertEquals(0, item.quality);
    }

    @Test
    void updateQualityTestBackStage3() {
        Item item = new Item("Backstage passes to a TAFKAL80ETC concert", 4,49);
        var g = new GildedRose(new Item[]{item});
        g.updateQuality();
        assertEquals(3, item.sellIn);
        assertEquals(50, item.quality);
    }

    @Test
    void updateQualityTestBackStage4() {
        Item item = new Item("Backstage passes to a TAFKAL80ETC concert", 14,49);
        var g = new GildedRose(new Item[]{item});
        g.updateQuality();
        assertEquals(13, item.sellIn);
        assertEquals(50, item.quality);
    }

    @Test
    void updateQualityTestBackStage5() {
        Item item = new Item("Backstage passes to a TAFKAL80ETC concert", 14,52);
        var g = new GildedRose(new Item[]{item});
        g.updateQuality();
        assertEquals(13, item.sellIn);
        assertEquals(52, item.quality);
    }

    @Test
    void updateQualityTestFoo() {
        Item item = new Item("foo", -1,-2);
        var g = new GildedRose(new Item[]{item});
        g.updateQuality();
        assertEquals(-2, item.sellIn);
        assertEquals(-2, item.quality);
    }

    @Test
    void updateQualityTestSulfuras() {
        Item item = new Item("Sulfuras, Hand of Ragnaros", 5, 10);
        var g = new GildedRose(new Item[]{item});
        g.updateQuality();
        assertEquals(5, item.sellIn);
        assertEquals(10, item.quality);
    }

    @Test
    void updateQualityTestSulfuras2() {
        Item item = new Item("Sulfuras, Hand of Ragnaros", 5, 0);
        var g = new GildedRose(new Item[]{item});
        g.updateQuality();
        assertEquals(5, item.sellIn);
        assertEquals(0, item.quality);
    }

    @Test
    void updateQualityTestSulfuras3() {
        Item item = new Item("Sulfuras, Hand of Ragnaros", -1, 5);
        var g = new GildedRose(new Item[]{item});
        g.updateQuality();
        assertEquals(-1, item.sellIn);
        assertEquals(5, item.quality);
    }
}
