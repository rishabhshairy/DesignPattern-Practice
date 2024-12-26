package com.rshairy.designs.BuilderDesignPattern.builders;

import java.util.ArrayList;
import java.util.List;

public class EnggStudentBuilder extends StudentBuilder {
    @Override
    public StudentBuilder setSubjects() {
        List<String> subjects = new ArrayList<>();
        subjects.add("Os");
        subjects.add("Networking");
        subjects.add("DBMS");
        subjects.add("DSA");
        this.subjects = subjects;
        return this;
    }
}
