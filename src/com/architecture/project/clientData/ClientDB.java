package com.architecture.project.clientData;

import java.util.ArrayList;

public class ClientDB {

    ArrayList<String> clients = new ArrayList<>();

    public void setClients() {

        ArrayList<String> oldClients = new ArrayList<>();
        oldClients.add("Ana Petranis");
        oldClients.add("Vaghe Gasparyan");
        oldClients.add("Ivan Petrov");

        this.clients = oldClients;
    }

    public ArrayList<String> getClients() {
        return clients;
    }

}

