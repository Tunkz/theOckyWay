package com.pluralsight.deli;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SandwichShop {

    private final static Scanner scanner = new Scanner(System.in);

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
        System.out.print("Select a number: ");
        String input = scanner.nextLine().trim();

        switch (input) {
            case "1":
                orderScreen();
                break;
            case "0":
                break;
            default:
                System.out.println("Error! Please select the right option from the provided ones!");


        }



    }

    private static void orderScreen() {
        boolean running = true;
        while (running) {
            System.out.println("┌──────────────────────────────────────────────────────┐\n" +
                    "│                                                      │\n" +
                    "│                                                      │\n" +
                    "│                   Order Screen                       │\n" +
                    "│                                                      │\n" +
                    "│                                                      │\n" +
                    "└──────────────────────────────────────────────────────┘");
            System.out.println("1) Add Sandwich");
            System.out.println("2) Add Drink");
            System.out.println("3) Add Chips");
            System.out.println("4) Checkout");
            System.out.println("0) Cancel Order");
            System.out.print("Please, select an option: ");
            String input = scanner.nextLine();

            String input1 = scanner.nextLine().trim();
            switch (input1) {
                case "1":

                    break;
                case "2":

                    break;
                case "3":

                    break;
                case "4":
                    break;
                case "0":

                    break;
                default:
                    System.out.println("Error! please select the right option from the ones provided!");


            }

        }
    }

    public void processAddSandwich() {
        System.out.println("Please, select the type of bread you want ");
        String breadType = scanner.nextLine();


        System.out.println("Please, select a size: ");


        int breadSize = scanner.nextInt();
        scanner.nextLine();

        //sandwich.setbread(bread)

        System.out.println("Would you like a topping? ");
        // Display premium toppings
        //array of topping, add whatever user select
        List<Topping> toppings = new ArrayList<>();
        String topping = scanner.nextLine();
        if (topping.equalsIgnoreCase("Yes")) {
            topping.
        }

//sandwich sandwich = new sandwich (size, bread, topping,...)
        //order.addsandwich(sandwich)


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

