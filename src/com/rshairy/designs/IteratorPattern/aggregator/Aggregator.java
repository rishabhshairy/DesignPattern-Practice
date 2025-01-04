package com.rshairy.designs.IteratorPattern.aggregator;

import com.rshairy.designs.IteratorPattern.iterator.Iterator;

public interface Aggregator {
    Iterator createIterator();
}
