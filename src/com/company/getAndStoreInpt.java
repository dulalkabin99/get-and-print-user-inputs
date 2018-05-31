package com.company;

import java.util.Scanner;

public class getAndStoreInpt {

    public static void main(String[] args) {
        Scanner nameAndStreetInput = new Scanner(System.in);
	// This program will get and store different variable

        System.out.println("First Initial: ");
        String firstInitial =nameAndStreetInput.next();

        System.out.println("Last Name: ");
        String lastName = nameAndStreetInput.next();

        System.out.println("House Number: ");
        int houseNumber = nameAndStreetInput.nextInt();

        System.out.println("Street Name: ");
        String streetName = nameAndStreetInput.next();

        System.out.println("Street Type: ");
        String streetType = nameAndStreetInput.next();

        System.out.println("City: ");
        String  city = nameAndStreetInput.next();

        System.out.print(firstInitial + " " + lastName + " " + houseNumber + " ");
        System.out.println(streetName + " " + streetType + " " + city);
    }
}
