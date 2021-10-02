package com.architecture.project.design;

import com.architecture.project.IDesign;

public class ExteriorCompositions implements IDesign {

    String items = "bench, streetlight, flowerbed";

    @Override
    public void addItems() {
        System.out.println("Added design items: " + items);
    }
}
