package com.pluralsight.deli;

import java.util.Scanner;

public class SandwichShop {


    public static void main(String[] args) {
        System.out.println("┌──────────────────────────────────────────────────────┐\n" +
                "│                                                      │\n" +
                "│                                                      │\n" +
                "│                                                      │\n" +
                "│        Hello! Welcome to the Sandwich shop!          │\n" +
                "│                                                      │\n" +
                "│                                                      │\n" +
                "│                                                      │\n" +
                "└──────────────────────────────────────────────────────┘");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please select an option: ");
        System.out.println("1) New Order");
        System.out.println("0) Exit ");
        String input = scanner.nextLine().trim();

        switch (input) {
            case "1":
                break;
            case "0":
                break;
            default:
                System.out.println("Error! Please select the right option from the provided ones!");


        }


    }
}

