package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {
        Scanner myscanner = new Scanner(System.in);


        //first question and scanner
        System.out.println("What is the serial number? ");
        int serialNumber = myscanner.nextInt();

        //second question and scanner
        System.out.println("What model is the phone? ");
        String model = myscanner.nextLine();

        //third question and scanner
        System.out.println("Who is your carrier? ");
        String carrier = myscanner.nextLine();

        //fourth question and scanner
        System.out.println("What is your phone number? ");
        int phoneNumber = myscanner.nextInt();

        //fifth question and scanner
        System.out.println("who is the owner of the phone");
        String owner = myscanner.nextLine();


        //Declaration & instantiate
        CellPhone information = new CellPhone(serialNumber, model, carrier, phoneNumber, owner);

        //Getters

        System.out.println(information.getSerialNumber());
        System.out.println(information.getModel());
        System.out.println(information.getCarrier());
        System.out.println(information.getPhoneNumber());
        System.out.println(information.getOwner());

    }
}
