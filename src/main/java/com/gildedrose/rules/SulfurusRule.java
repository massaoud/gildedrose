package com.gildedrose.rules;

import com.gildedrose.Item;

public class SulfurusRule implements Rule {
    private Item result;
    @Override
    public boolean evaluate(Item item) {
        boolean evalResult = false;
        this.result = new Item(item);
        if (item.getName().equalsIgnoreCase(Item.SULFURUS)) {
            this.result.setQuality(item.getQuality());
            this.result.setSellIn(item.getSellIn());
            evalResult = true;
        }
        return evalResult;
    }

    @Override
    public Item getResult() {
        return new Item(result);
    }
}
