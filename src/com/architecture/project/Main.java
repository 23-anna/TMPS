package com.architecture.project;

import com.architecture.project.bankOperations.Card;
import com.architecture.project.bankOperations.Cash;
import com.architecture.project.bankOperations.IMoney;
import com.architecture.project.builders.BusinessCenterBuilder;
import com.architecture.project.builders.HouseBuilder;
import com.architecture.project.builders.SchoolBuilder;
import com.architecture.project.buildings.BusinessCenter;
import com.architecture.project.buildings.House;
import com.architecture.project.buildings.School;
import com.architecture.project.design.Exterior;
import com.architecture.project.design.Interior;
import com.architecture.project.design.InteriorAttributes;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Welcome to the Architectural Firm!\n" +
                            "What type of building would you like to construct?\n" +
                            "1. School\n" +
                            "2. Business Center\n" +
                            "3. Private House");

        Scanner scanner = new Scanner(System.in);
        String building = scanner.nextLine();

        Boolean landscape = false;

        try{
            switch (building){

                case "School":
                    landscape = true;
                    Deal schoolDeal = new Deal();
                    SchoolBuilder builder = new SchoolBuilder();
                    schoolDeal.makeSchool(builder);
                    School school = builder.getResult();

                    System.out.println("Your school parameters:");
                    System.out.println(school.attributes);

                    System.out.println("Do you want some personal designs?");
                    String schoolAnswer = scanner.nextLine();
                    if (schoolAnswer.equals("Yes")){
                        settingsAndPayment(scanner);
                    }
                    break;

                case "Business Center":
                    Deal businessDeal = new Deal();
                    BusinessCenterBuilder businessBuilder = new BusinessCenterBuilder();
                    businessDeal.makeBusinessCenter(businessBuilder);
                    BusinessCenter businessCenter = businessBuilder.getResult();

                    System.out.println("Your business center parameters:");
                    System.out.println(businessCenter.attributes);

                    System.out.println("Do you want some personal designs?");
                    String businessAnswer = scanner.nextLine();
                    if (businessAnswer.equals("Yes")){
                        settingsAndPayment(scanner);
                    }
                    break;

                case "Private House":
                    landscape = true;
                    Deal houseDeal = new Deal();
                    HouseBuilder houseBuilder = new HouseBuilder();
                    houseDeal.makePrivateHouse(houseBuilder);
                    House house = houseBuilder.getResult();

                    System.out.println("Your house parameters:");
                    System.out.println(house.attributes);

                    System.out.println("Do you want some personal designs?");
                    String houseAnswer = scanner.nextLine();
                    if (houseAnswer.equals("Yes")){
                        settingsAndPayment(scanner);
                    }
                    break;

                default:
                    break;
            }

            if (landscape){
                System.out.println("Do you want some personal designs in the garden?");
                String answer = scanner.nextLine();
                if (answer.equals("Yes")){
                    Designer designer = new Exterior();
                    designer.startDesign();
                }

                System.out.println("Your project is ready!");
            }


        } catch (Exception e){
            System.out.println("Check word spelling or the correctness of data");
        }
    }

    static void settingsAndPayment(Scanner scanner){
        String color = "";
        String material = "";
        InteriorAttributes objects = new InteriorAttributes();

        System.out.println("Table material:");
        material = scanner.nextLine();
        System.out.println("Table color:");
        color = scanner.nextLine();
        objects.setTable(color, material);

        System.out.println("Mirror material:");
        material = scanner.nextLine();
        System.out.println("Mirror color:");
        color = scanner.nextLine();
        objects.setMirror(color, material);

        System.out.println("Curtain material:");
        material = scanner.nextLine();
        System.out.println("Curtain color:");
        color = scanner.nextLine();
        objects.setCurtain(color, material);

        System.out.println("Armchair material:");
        material = scanner.nextLine();
        System.out.println("Armchair color:");
        color = scanner.nextLine();
        objects.setArmchair(color, material);

        Designer designer = new Interior();
        designer.startDesign();

        int totalPrice = objects.getTotalPrice();
        System.out.println("Design's total price: " + totalPrice);

        Cash cash = new Cash();
        Card card = new Card(cash);
        System.out.println("Do you want to pay by card?");
        String answer = scanner.nextLine();
        if (answer.equals("Yes")){
            card.doTransaction(totalPrice);
        }
    }
}
