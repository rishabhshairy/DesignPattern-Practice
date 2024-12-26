package com.rshairy.designs.BuilderDesignPattern;

import com.rshairy.designs.BuilderDesignPattern.builders.EnggStudentBuilder;
import com.rshairy.designs.BuilderDesignPattern.builders.MBBSStudentBuilder;
import com.rshairy.designs.BuilderDesignPattern.builders.StudentBuilder;

public class StudentDirector {
    StudentBuilder studentBuilder;

    public StudentDirector(StudentBuilder studentBuilder) {
        this.studentBuilder = studentBuilder;
    }

    public Student createStudent() {
        if (studentBuilder instanceof EnggStudentBuilder) {
            return createEnggStudent();
        } else if (studentBuilder instanceof MBBSStudentBuilder) {
            return createMbbsStudent();
        }
        return null;
    }

    private Student createMbbsStudent() {
        return studentBuilder
                .setRollNumber(2001)
                .setAge(22)
                .setFatherName("ABC")
                .setMotherName("DEF")
                .setSubjects()
                .build();
    }

    private Student createEnggStudent() {
        return studentBuilder.setRollNumber(1001).setAge(19).setFatherName("ABC").setSubjects().build();
    }
}
