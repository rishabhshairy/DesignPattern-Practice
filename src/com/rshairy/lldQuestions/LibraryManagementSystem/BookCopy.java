package com.rshairy.lldQuestions.LibraryManagementSystem;

import java.util.Date;

public class BookCopy {
    private String copyId;
    private Book book;
    private boolean isBorrowed;
    private User borrowedBy;
    private Date dueDate;

    public BookCopy(String copyId, Book book) {
        this.copyId = copyId;
        this.book = book;
        // when creating copy borrowed is false
        this.isBorrowed = false;
    }

    public void borrow(User user, Date dueDate) {
        this.dueDate = dueDate;
        this.borrowedBy = user;
        this.isBorrowed = true;

    }

    public String getCopyId() {
        return copyId;
    }

    public void setCopyId(String copyId) {
        this.copyId = copyId;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    public void setBorrowed(boolean borrowed) {
        isBorrowed = borrowed;
    }

    public User getBorrowedBy() {
        return borrowedBy;
    }

    public void setBorrowedBy(User borrowedBy) {
        this.borrowedBy = borrowedBy;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }


}
