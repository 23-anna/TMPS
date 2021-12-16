package com.architecture.project.clientData.handlers;

import com.architecture.project.clientData.ClientDB;
import com.architecture.project.clientData.Request;

public class BasicHandler implements IHandler {

    BasicHandler nextHandler;
    ClientDB clients = new ClientDB();

    public void setClients(ClientDB clients) {
        this.clients = clients;
    }

    @Override
    public void handle(Request request) {
        if(nextHandler != null){
            nextHandler.handle(request);
        }
    }
}
