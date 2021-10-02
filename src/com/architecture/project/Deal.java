package com.architecture.project;

public class Deal {

    public void makePrivateHouse(IBuilder builder){
        builder.create();
        builder.setWindows("Wood");
        builder.setWalls("Brick");
        builder.setRoof("Slate");
        builder.setFloors(2);
        builder.setRooms(5);
        builder.setKitchenType("Kitchen");
        builder.setGarden(true);
        builder.setPool(true);
        builder.setGym(false);
    }

    public void makeBusinessCenter(IBuilder builder){
        builder.create();
        builder.setWindows("Plastic");
        builder.setWalls("Stone");
        builder.setRoof("Tarpaper");
        builder.setFloors(14);
        builder.setRooms(140);
        builder.setKitchenType("Dinning Hall");
        builder.setGarden(false);
        builder.setPool(false);
        builder.setGym(true);

    }

    public void makeSchool(IBuilder builder){
        builder.create();
        builder.setWindows("Plastic");
        builder.setWalls("Brick");
        builder.setRoof("Tarpaper");
        builder.setFloors(4);
        builder.setRooms(50);
        builder.setKitchenType("Canteen");
        builder.setGarden(true);
        builder.setPool(true);
        builder.setGym(true);
    }
}
