package com.architecture.project.buildings;

import com.architecture.project.builders.HouseBuilder;

import java.util.HashMap;

public class House extends HouseBuilder {

    private static House house = new House();

    public HashMap<String, String> attributes = new HashMap<>();

    private House(){}

    public static House getHouse() {
        return house;
    }
}
