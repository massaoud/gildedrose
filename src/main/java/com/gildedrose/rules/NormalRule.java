package com.gildedrose.rules;

import com.gildedrose.Item;

public class NormalRule implements Rule {
    private Item result;
    @Override
    public boolean evaluate(Item item) {
        boolean evalResult = false;
        this.result = new Item(item);
        if (!item.getName().equalsIgnoreCase(Item.AGED_BRIE) &&
            !item.getName().equalsIgnoreCase(Item.BACK_STAGE_PASSES) &&
            !item.getName().equalsIgnoreCase(Item.SULFURUS) &&
            !item.getName().equalsIgnoreCase(Item.CONJURED)
        ) {
             item.setQuality(item.getQuality() > 0 ? item.getQuality()-1 : item.getQuality());
            item.setSellIn(item.getSellIn()-1);
            if (item.getSellIn() < 0 && item.getQuality() > 0 )
                item.setQuality(item.getQuality()-1);
            else if (item.getSellIn() < 0 && item.getQuality() < 50)
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
