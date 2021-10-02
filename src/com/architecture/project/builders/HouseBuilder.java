package com.architecture.project.builders;

import com.architecture.project.buildings.House;
import com.architecture.project.IBuilder;

public class HouseBuilder implements IBuilder {

    House house;

    @Override
    public void create() {
        this.house = House.getHouse();
    }

    @Override
    public void setWalls(String material){ house.attributes.put("Walls material", material); }

    @Override
    public void setWindows(String material){
        house.attributes.put("Windows material", material);
    }

    @Override
    public void setRoof(String material){
        house.attributes.put("Roof material", material);
    }

    @Override
    public void setFloors(Integer number){
        house.attributes.put("Number of floors", number.toString());
    }

    @Override
    public void setRooms(Integer number){
        house.attributes.put("Number of rooms", number.toString());
    }

    @Override
    public void setKitchenType(String type){
        house.attributes.put("Kitchen type", type);
    }

    @Override
    public void setGarden(Boolean bool){
        house.attributes.put("Has garden", bool.toString());
    }

    @Override
    public void setPool(Boolean bool){
        house.attributes.put("Has pool", bool.toString());
    }

    @Override
    public void setGym(Boolean bool){
        house.attributes.put("Has gym", bool.toString());
    }

    public House getResult(){ return house; }
}
