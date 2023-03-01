package com.gildedrose;

import com.gildedrose.rules.*;

import java.util.ArrayList;
import java.util.List;

public class RuleEngine {

    private static final List<Rule> rules = new ArrayList<>();

    static {
        rules.add(new AgedBrieRule());
        rules.add(new BackstagePassesRule());
        rules.add(new NormalRule());
        rules.add(new SulfurusRule());
        rules.add(new ConjuredRule());
    }

    public Item process(Item expression) {
        Rule rule = rules
            .stream()
            .filter(r -> r.evaluate(expression))
            .findFirst()
            .orElseThrow(() -> new IllegalArgumentException("Expression does not matches any Rule"));
        return rule.getResult();
    }
}
