package com.rshairy.lldQuestions.LibraryManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class User {
    private Integer userId;
    private String name;
    private List<BookCopy> borrowsBookCopies;

    public User(Integer userId, String name) {
        this.userId = userId;
        this.name = name;
        borrowsBookCopies = new ArrayList<>();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<BookCopy> getBorrowsBookCopies() {
        return borrowsBookCopies;
    }

    public void setBorrowsBookCopies(List<BookCopy> borrowsBookCopies) {
        this.borrowsBookCopies = borrowsBookCopies;
    }

    public void borrow(BookCopy bookCopy) {
        borrowsBookCopies.add(bookCopy);
    }
}
