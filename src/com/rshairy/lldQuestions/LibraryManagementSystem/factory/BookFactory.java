package com.rshairy.lldQuestions.LibraryManagementSystem.factory;

import com.rshairy.lldQuestions.LibraryManagementSystem.Book;

import java.util.Set;

public class BookFactory {
    public Book createBook(String domain, String bookId, String title, Set<String> authors, String publisher) {
        switch (domain) {
            case "Engineering":
                return new EngineeringBook(bookId, title, authors, publisher);
            case "Medical":
                return new MedicalBook(bookId, title, authors, publisher);
        }
        return null;
    }
}
