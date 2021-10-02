package com.architecture.project.builders;

import com.architecture.project.buildings.BusinessCenter;
import com.architecture.project.IBuilder;

public class BusinessCenterBuilder implements IBuilder {

    BusinessCenter businessCenter;

    @Override
    public void create() {
        this.businessCenter = BusinessCenter.getBusinessCenter();
    }

    @Override
    public void setWalls(String material){ businessCenter.attributes.put("Walls material", material); }

    @Override
    public void setWindows(String material){
        businessCenter.attributes.put("Windows material", material);
    }

    @Override
    public void setRoof(String material){
        businessCenter.attributes.put("Roof material", material);
    }

    @Override
    public void setFloors(Integer number){
        businessCenter.attributes.put("Number of floors", number.toString());
    }

    @Override
    public void setRooms(Integer number){
        businessCenter.attributes.put("Number of rooms", number.toString());
    }

    @Override
    public void setKitchenType(String type){
        businessCenter.attributes.put("Kitchen type", type);
    }

    @Override
    public void setGarden(Boolean bool){
        businessCenter.attributes.put("Has garden", bool.toString());
    }

    @Override
    public void setPool(Boolean bool){
        businessCenter.attributes.put("Has pool", bool.toString());
    }

    @Override
    public void setGym(Boolean bool){
        businessCenter.attributes.put("Has gym", bool.toString());
    }

    public BusinessCenter getResult(){ return businessCenter; }
}
