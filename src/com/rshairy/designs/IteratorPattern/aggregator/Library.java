package com.rshairy.designs.IteratorPattern.aggregator;

import com.rshairy.designs.IteratorPattern.Book;
import com.rshairy.designs.IteratorPattern.iterator.BookIterator;
import com.rshairy.designs.IteratorPattern.iterator.Iterator;

import java.util.List;

public class Library implements Aggregator {

    private List<Book> books;

    public Library(List<Book> books) {
        this.books = books;
    }

    @Override
    public Iterator createIterator() {
        return new BookIterator(books);
    }
}
