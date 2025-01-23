package com.rshairy.lldQuestions.LibraryManagementSystem;

import com.rshairy.lldQuestions.LibraryManagementSystem.factory.BookFactory;

import java.util.*;

public class Library {
    Map<String, Book> bookMap;
    Map<Integer, User> userMap;
    Map<Integer, Rack> rackMap;


    public void createLibrary() {
        bookMap = new HashMap<>();
        userMap = new HashMap<>();
        rackMap = new HashMap<>();


        for (int i = 0; i < 15; i++) {
            rackMap.put(i, new Rack(i));
        }
        // create users
        createAndAddUsers();

    }

    public void borrowBookByBookId(String bookId, Integer userId, Date dueDate) {
        User user = userMap.get(userId);

        if (user == null || user.getBorrowsBookCopies().size() >= 5) {
            System.out.println("User Cannot Borrow Books");
            return;
        }

        // check if book is available
        Book book = bookMap.get(bookId);
        if (book == null) {
            System.out.println("Book Not Available");
            return;
        }

        // Check which book copy is not borrowed
        for (BookCopy bookCopy : book.getBookCopies()) {
            if (!bookCopy.isBorrowed()) {
                // remove from rack
                Rack rack = getRackForBookCopy(bookCopy.getCopyId());
                if (rack != null) {
                    rack.removeBookCopyId(bookCopy.getCopyId());
                    bookCopy.borrow(user, dueDate);
                    user.borrow(bookCopy);
                    System.out.println("Book Borrowed by User " + user.getName());
                    return;
                }
            }
        }
        System.out.println("No available book copies");
    }

    private Rack getRackForBookCopy(String bookCopyId) {
        for (Rack rack : rackMap.values()) {
            if (rack.hasBookCopy(bookCopyId)) {
                return rack;
            }
        }
        return null;
    }

    public void addBooksToLibrary(Book book, int copyCount) {
        // Add to first available rack
        bookMap.putIfAbsent(book.getBookId(), book);
        for (int i = 0; i < copyCount; i++) {
            Rack rack = getFirstAvailableRack();
            if (rack != null) {
                String bookCopyId = book.getBookId() + "-" + i;
                BookCopy bookCopy = new BookCopy(bookCopyId, book);
                rack.addBookCopy(bookCopyId, bookCopy);
                book.addBookCopy(bookCopy);
            } else {
                System.out.println("No Racks Are Free");
                break;
            }
        }

    }

    public void removeBookCopy(String bookCopyId) {
        for (Rack rack : rackMap.values()) {
            if (rack.removeBookCopyId(bookCopyId)) {
                System.out.println("Book Copy Removed");
                break;
            }
        }
    }

    private Rack getFirstAvailableRack() {
        for (Rack rack : rackMap.values()) {
            if (!rack.isFull()) {
                return rack;
            }
        }
        return null;
    }

    private void createAndAddUsers() {
        User user1 = new User(1001, "Rishabh");
        User user2 = new User(1002, "Sourav");
        User user3 = new User(1003, "Abc");
        User user4 = new User(1004, "XYZ");

        this.userMap.put(user1.getUserId(), user1);
        this.userMap.put(user2.getUserId(), user2);
        this.userMap.put(user3.getUserId(), user3);
        this.userMap.put(user4.getUserId(), user4);
    }
}
