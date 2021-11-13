package com.architecture.project;

public class DesignSketch {

    IDesigner designer;

    public DesignSketch(IDesigner designer){
        this.designer = designer;
    }

    public void checkColor(String color){
        if (!designer.hasColor()){
            designer.setColor(color);
        }
    }

    public void checkMaterial(String material){
        if (!designer.hasMaterial()){
            designer.setMaterial(material);
        }
    }
}
