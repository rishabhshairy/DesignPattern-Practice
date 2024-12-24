package com.rshairy.designs.CompositeDesignPattern.ProblemStatementFileSys;

public class File {
    String fileName;

    public File(String fileName) {
        this.fileName = fileName;
    }

    void ls() {
        System.out.println("File name is " + this.fileName);
    }
}
