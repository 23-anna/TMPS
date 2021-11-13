package com.architecture.project;

import java.util.ArrayList;

public class CompoundDesigner {

    ArrayList<IDesigner> objects = new ArrayList<>();
    public int totalPrice = 0;

    public void add(IDesigner object){
        objects.add(object);
        int currentPrice = 0;
        for (int i = 0; i < objects.size(); i++){
            currentPrice = currentPrice + objects.get(i).getPrice();
        }
        this.totalPrice = currentPrice;
    }
}
