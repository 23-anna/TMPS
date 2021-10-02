package com.architecture.project.design;

import com.architecture.project.Designer;
import com.architecture.project.IDesign;
import com.architecture.project.design.InteriorAttributes;

public class Interior extends Designer {


    public IDesign createDesign() {
        return new InteriorAttributes();
    }

}
