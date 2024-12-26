package com.rshairy.designs.BuilderDesignPattern.builders;

import java.util.ArrayList;
import java.util.List;

public class MBBSStudentBuilder extends StudentBuilder{

    @Override
    public StudentBuilder setSubjects() {
        List<String> subjects = new ArrayList<>();
        subjects.add("Anatomy");
        subjects.add("Biology");
        subjects.add("Dental");
        subjects.add("Neuro");
        this.subjects = subjects;
        return this;
    }
}
