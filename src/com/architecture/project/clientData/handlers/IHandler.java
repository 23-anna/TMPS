package com.architecture.project.clientData.handlers;

import com.architecture.project.clientData.ClientDB;
import com.architecture.project.clientData.Request;

public interface IHandler {

    void setClients (ClientDB clients);

    void handle (Request request);

}
