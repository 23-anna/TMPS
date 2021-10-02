package com.architecture.project;

public interface IBuilder {

    void create();

    void setWalls(String material);

    void setWindows(String material);

    void setRoof(String material);

    void setFloors(Integer number);

    void setRooms(Integer number);

    void setKitchenType(String type);

    void setGarden(Boolean bool);

    void setPool(Boolean bool);

    void setGym(Boolean bool);
}
