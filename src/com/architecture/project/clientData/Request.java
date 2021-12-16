package com.architecture.project.clientData;

public class Request {

    public String client;
    public String building;
    public Integer discount;

    public Request(String client, String building) {
        this.client = client;
        this.building = building;
    }

    public Integer getDiscount() {
        return discount;
    }
}
