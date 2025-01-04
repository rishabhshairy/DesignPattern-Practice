package com.rshairy.designs.IteratorPattern;

import com.rshairy.designs.IteratorPattern.aggregator.Library;
import com.rshairy.designs.IteratorPattern.iterator.Iterator;

import java.util.ArrayList;

public class Client {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book("ABC", 100));
        books.add(new Book("DD", 1000));
        books.add(new Book("SS", 10220));
        books.add(new Book("FFF", 100111));
        books.add(new Book("CC", 100121));

        Library library = new Library(books);
        Iterator libraryIterator = library.createIterator();

        while (libraryIterator.hasNext()){
            System.out.println(libraryIterator.next());
        }
    }
}
