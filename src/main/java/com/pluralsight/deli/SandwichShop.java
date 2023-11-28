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

    private static void newOrder(Scanner scanner) {
        boolean running = true;
        while (running) {
            System.out.println("Ready to order? Here are a variety of choices!");
            System.out.println("Choose an option: ");
            System.out.println("1) Add Sandwich");
            System.out.println("2) Add Drink");
            System.out.println("3) Add Chips");
            System.out.println("4) Checkout");
            System.out.println("x) Cancel Order");

            String input = scanner.nextLine().trim();

            switch (input.toUpperCase()) {
                case "1":
                    break;
                case "2":
                    break;
                case "3":
                    break;
                case "4":
                    break;
                case "X":
                    running = false;
                    break;
                default:
                    System.out.println("Invalid Option! Please try again.");
                    break;
            }
        }
    }

}

