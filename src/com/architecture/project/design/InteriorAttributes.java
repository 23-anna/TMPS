package com.architecture.project.design;

import com.architecture.project.IDesign;

public class InteriorAttributes implements IDesign {

    String items = "table, armchair, mirror, curtain";

    @Override
    public void addItems() {
        System.out.println("Added design items: " + items);
    }
}
