package com.rshairy.designs.CompositeDesignPattern.ProblemStatementFileSys;

import java.util.ArrayList;
import java.util.List;

public class Directory {
    String name;
    List<Object> objects;

    public Directory(String name) {
        this.name = name;
        objects = new ArrayList<>();
    }

    public void add(Object object) {
        objects.add(object);
    }

    public void ls() {
        System.out.println("Directory name is " + this.name);

        // here comes the problem
        for (Object obj : objects) {
            // here we have to check what is the type of object manually
            // whether its file or directory itself

            if (obj instanceof File) {
                ((File) obj).ls();
            } else if (obj instanceof Directory) {
                ((Directory) obj).ls();
            }
        }
    }
}
