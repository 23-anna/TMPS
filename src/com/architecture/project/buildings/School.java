package com.architecture.project.buildings;

import com.architecture.project.builders.SchoolBuilder;

import java.util.HashMap;

public class School extends SchoolBuilder {

    private static School school = new School();

    public HashMap<String, String> attributes = new HashMap<>();

    private School(){}

    public static School getSchool() {
        return school;
    }
}
