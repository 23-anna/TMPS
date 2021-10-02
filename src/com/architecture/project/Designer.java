package com.architecture.project;

public abstract class Designer{


    public void startDesign(){
        IDesign design = createDesign();
        design.addItems();
    }

    public abstract IDesign createDesign();
}
