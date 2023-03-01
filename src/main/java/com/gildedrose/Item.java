package com.gildedrose;

public class Item {

    private String name;

    private int sellIn;

    private int quality;

    public Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

    public Item(Item item) {
        this.name = item.getName();
        this.sellIn = item.getSellIn();
        this.quality = item.getQuality();
    }

    @Override
   public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }

   public   static final String  AGED_BRIE = "Aged Brie";
    public   static final String  BACK_STAGE_PASSES = "Backstage passes to a TAFKAL80ETC concert";
    public   static final String  SULFURUS = "Sulfuras, Hand of Ragnaros";
    public   static final String  CONJURED = "Conjured Mana Cake";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSellIn() {
        return sellIn;
    }

    public void setSellIn(int sellIn) {
        this.sellIn = sellIn;
    }

    public int getQuality() {
        return quality;
    }

    public void setQuality(int quality) {
        this.quality = quality;
    }
}
