package com.architecture.project.builders;

import com.architecture.project.IBuilder;
import com.architecture.project.buildings.School;

public class SchoolBuilder implements IBuilder {

    School school;

    @Override
    public void create() {
        this.school = School.getSchool();
    }

    @Override
    public void setWalls(String material){
        school.attributes.put("Walls material", material);
    }

    @Override
    public void setWindows(String material){
        school.attributes.put("Windows material", material);
    }

    @Override
    public void setRoof(String material){
        school.attributes.put("Roof material", material);
    }

    @Override
    public void setFloors(Integer number){
        school.attributes.put("Number of floors", number.toString());
    }

    @Override
    public void setRooms(Integer number){
        school.attributes.put("Number of rooms", number.toString());
    }

    @Override
    public void setKitchenType(String type){
        school.attributes.put("Kitchen type", type);
    }

    @Override
    public void setGarden(Boolean bool){
        school.attributes.put("Has garden", bool.toString());
    }

    @Override
    public void setPool(Boolean bool){
        school.attributes.put("Has pool", bool.toString());
    }

    @Override
    public void setGym(Boolean bool){
        school.attributes.put("Has gym", bool.toString());
    }

    public School getResult(){
        return school;
    }

}
