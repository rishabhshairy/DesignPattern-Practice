package com.rshairy.designs.BuilderDesignPattern;

import com.rshairy.designs.BuilderDesignPattern.builders.EnggStudentBuilder;
import com.rshairy.designs.BuilderDesignPattern.builders.MBBSStudentBuilder;
import com.rshairy.designs.BuilderDesignPattern.builders.StudentBuilder;

/**
 * Here College is client
 */
public class College {
    public static void main(String[] args) {
        StudentDirector enggDirector = new StudentDirector(new EnggStudentBuilder());
        StudentDirector mbbsDirector = new StudentDirector(new MBBSStudentBuilder());

        Student enggStudent = enggDirector.createStudent();
        Student mbbsStudent = mbbsDirector.createStudent();

        System.out.println(enggStudent);
        System.out.println(mbbsStudent);
    }
}
