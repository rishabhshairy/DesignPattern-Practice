package com.rshairy.lldQuestions.LibraryManagementSystem.factory;

import com.rshairy.lldQuestions.LibraryManagementSystem.Book;

import java.util.Set;

public class MedicalBook extends Book {
    public MedicalBook(String bookId, String title, Set<String> authors, String publisher) {
        super(bookId, title, authors, publisher);
    }
}
