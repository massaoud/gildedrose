package com.gildedrose.rules;

import com.gildedrose.Item;

public interface Rule {

    boolean evaluate(Item item);
    Item getResult();
}
