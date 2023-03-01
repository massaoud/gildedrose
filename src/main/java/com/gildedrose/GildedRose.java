package com.gildedrose;

import java.util.Arrays;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        RuleEngine engine = new RuleEngine();
        Arrays.stream(items).forEach(engine::process);

    }

}
