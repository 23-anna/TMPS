package com.architecture.project.buildings;

import com.architecture.project.builders.BusinessCenterBuilder;

import java.util.HashMap;

public class BusinessCenter extends BusinessCenterBuilder {

    private static BusinessCenter businessCenter = new BusinessCenter();

    public HashMap<String, String> attributes = new HashMap<>();

    private BusinessCenter(){}

    public static BusinessCenter getBusinessCenter() {
        return businessCenter;
    }
}
