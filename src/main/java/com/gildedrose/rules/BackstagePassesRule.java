package com.gildedrose.rules;

import com.gildedrose.Item;

public class BackstagePassesRule implements Rule {
    private Item result;
    @Override
    public boolean evaluate(Item item) {
        boolean evalResult = false;
        this.result = new Item(item);
        if (item.getName().equalsIgnoreCase(Item.BACK_STAGE_PASSES)) {
            if (item.getQuality() < 50){
                item.setQuality(item.getQuality() + 1);
                if (item.getSellIn() < 11 && item.getQuality() < 50)
                    item.setQuality(item.getQuality() + 1);
              if (item.getSellIn() < 6 && item.getQuality() < 50 )
                    item.setQuality(item.getQuality() + 1);
            }
      item.setSellIn(item.getSellIn()-1);

            if (item.getSellIn() < 0)
                item.setQuality(0);
            //
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
