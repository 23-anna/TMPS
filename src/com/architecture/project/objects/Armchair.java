package com.architecture.project.objects;

import com.architecture.project.IDesigner;

public class Armchair implements IDesigner {

    String color = "";
    String material = "";

    Boolean isColored = false;
    Boolean isMaterial = false;

    Integer price = 300;

    @Override
    public Integer getPrice(){
        return price;
    }

    @Override
    public boolean hasColor(){
        return isColored;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public boolean hasMaterial(){
        return isMaterial;
    }

    @Override
    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String getMaterial() {
        return material;
    }
}
