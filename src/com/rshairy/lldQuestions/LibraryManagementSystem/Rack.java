package com.rshairy.lldQuestions.LibraryManagementSystem;

import java.util.HashMap;
import java.util.Map;

public class Rack {
    private int rackNumber;
    private Map<String, BookCopy> bookCopyMap;

    public Rack(int rackNumber) {
        this.rackNumber = rackNumber;
        this.bookCopyMap = new HashMap<>();
    }

    public int getRackNumber() {
        return rackNumber;
    }

    public void setRackNumber(int rackNumber) {
        this.rackNumber = rackNumber;
    }

    public Map<String, BookCopy> getBookCopyMap() {
        return bookCopyMap;
    }

    public void setBookCopyMap(Map<String, BookCopy> bookCopyMap) {
        this.bookCopyMap = bookCopyMap;
    }

    public boolean isFull() {
        return bookCopyMap.size() >= 1; // allowing each rack to hold one book
    }

    public void addBookCopy(String bookCopyId, BookCopy bookCopy) {
        bookCopyMap.put(bookCopyId, bookCopy);
    }

    public boolean removeBookCopyId(String bookCopyId) {
        return bookCopyMap.remove(bookCopyId) != null;
    }

    public boolean hasBookCopy(String bookCopyId) {
        return bookCopyMap.containsKey(bookCopyId);
    }
}
