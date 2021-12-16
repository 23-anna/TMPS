package com.architecture.project.clientData.handlers;

import com.architecture.project.clientData.Request;
import com.architecture.project.clientData.handlers.BasicHandler;

public class HandleDiscount extends BasicHandler {

    public void handle(Request request){
        if (request.building.equals("School")){
            request.discount = 5;
            System.out.println("For our old clients who want to build a school we have a Christmas sale -5%");
        } else if (request.building.equals("Business Center")){
            request.discount = 3;
            System.out.println("For our old clients who want to build a business center we have a Christmas sale -3%");
        } else if (request.building.equals("Private House")){
            request.discount = 10;
            System.out.println("For our old clients who want to build a private house we have a Christmas sale -10%");
        }
    }
}
