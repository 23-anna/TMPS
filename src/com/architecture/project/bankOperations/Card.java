package com.architecture.project.bankOperations;

public class Card implements IMoney{

    Cash cash;
    int amount;

    public Card(Cash cash){
        this.cash = cash;
        this.amount = 500;
    }

    public boolean checkAccess(int money){

        boolean response = false;
        System.out.println("Card balance: " + amount);
        if (money <= this.amount){
            System.out.println("Transaction: -" + money);
            response = true;
        } else {
            System.out.println("Not enough money on your account!\nNew cash -> card transaction...");
        }

        return response;
    }

    @Override
    public void doTransaction(int money) {
        if (checkAccess(money)){
            amount = amount - money;
            System.out.println("New card balance " + amount);
        } else {
            amount = amount + (money - amount);
            this.cash.amount = cash.amount - (money - amount);
            doTransaction(money);
        }
    }
}
