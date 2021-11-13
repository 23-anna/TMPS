package com.architecture.project.bankOperations;

public class Cash implements IMoney{

    int amount = 15000;

    @Override
    public void doTransaction(int money) {
        this.amount = this.amount - money;
    }
}
