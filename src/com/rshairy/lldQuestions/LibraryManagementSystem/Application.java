package com.rshairy.lldQuestions.LibraryManagementSystem;

import com.rshairy.lldQuestions.LibraryManagementSystem.factory.BookFactory;
import com.rshairy.lldQuestions.LibraryManagementSystem.factory.EngineeringBook;

import java.util.Date;
import java.util.HashSet;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        Library library = new Library();
        BookFactory bookFactory=new BookFactory();
        Book book1 = bookFactory.createBook("Engineering","12001","System Design Interview", new HashSet<>(List.of("Alex Xu")),"SYSDIN");

        library.createLibrary();

        library.addBooksToLibrary(book1,5);

        library.borrowBookByBookId("12001",1002,new Date());
    }

    private void createBooks() {
        Book sdiBook = new Book("12001","System Design Interview", new HashSet<>(List.of("Alex Xu")),"SYSDIN");
        Book dsaAlgo = new Book("13001","DSA Made Easy", new HashSet<>(List.of("Narsimha")),"Crown");
        Book networking = new Book("14001","Net Concepts", new HashSet<>(List.of("Ferguson")),"King");
        Book operSys = new Book("15001","OS Concepts", new HashSet<>(List.of("Abcaa")),"Jack");
    }
}
