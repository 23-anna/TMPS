package com.architecture.project.clientData.handlers;

import com.architecture.project.clientData.Request;

public class HandleClient extends BasicHandler {

    public void handle(Request request){
        clients.setClients();
        if (clients.getClients().contains(request.client)){
            BasicHandler h2 = new HandleDiscount();
            h2.handle(request);
        } else {
            request.discount = 2;
            System.out.println("For our new clients we have a Christmas sale -2%");
        }
    }
}
