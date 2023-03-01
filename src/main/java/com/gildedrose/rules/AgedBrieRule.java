package com.gildedrose.rules;

import com.gildedrose.Item;

public class AgedBrieRule implements Rule {
    private Item result;
    @Override
    public boolean evaluate(Item item) {
        boolean evalResult = false;
        this.result = new Item(item);
        if (item.getName().equalsIgnoreCase(Item.AGED_BRIE)) {
            item.setQuality(item.getQuality() < 50 ? item.getQuality()+1 : item.getQuality());
            item.setSellIn(item.getSellIn()-1);

            if (item.getQuality() < 50 && item.getSellIn() < 0)
                item.setQuality(item.getQuality()+1);
            this.result.setSellIn(item.getSellIn());
            this.result.setQuality(item.getQuality());
            evalResult = true;
        }
        return evalResult;
    }

    @Override
    public Item getResult() {
        return new Item(result);
    }
}
