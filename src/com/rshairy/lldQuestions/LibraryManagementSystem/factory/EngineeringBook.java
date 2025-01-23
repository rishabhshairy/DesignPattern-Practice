package com.rshairy.lldQuestions.LibraryManagementSystem.factory;

import com.rshairy.lldQuestions.LibraryManagementSystem.Book;

import java.util.Set;

public class EngineeringBook extends Book {
    public EngineeringBook(String bookId, String title, Set<String> authors, String publisher) {
        super(bookId, title, authors, publisher);
    }
}
