package com.pluralsight.deli;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SandwichShop {

    private final static Scanner scanner = new Scanner(System.in);
    private List<Sandwich> sandwiches = new ArrayList<>();
    private List<Drink> drinks = new ArrayList<>();
    private List<Chips> chips = new ArrayList<>();
    private final Order order = new Order(sandwiches, drinks, chips);

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

                break;
            case "0":


                orderScreen();


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
            System.out.println("x) Cancel Order");
            System.out.print("Please, select an option: ");
            String input = scanner.nextLine();

            String input1 = scanner.nextLine().trim();
            switch (input1.toUpperCase()) {
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
                    System.out.println("Error! please select the right option from the ones provided!");


            }

        }

    }

    public void processAddSandwich() {
        System.out.println("Please, select the type of bread you want ");
        // Display breadTypes
        String breadType = scanner.nextLine();

        System.out.println("Please, select a size: ");
        int breadSize = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Would you like a topping? ");
        List<Topping> toppings = new ArrayList<>();
        String topping = scanner.nextLine();
        if (topping.equalsIgnoreCase("Yes")) {
            System.out.println("Select a meat of your choice: ");
            // Display premium toppings
            String premiumTopping = scanner.nextLine();
            Topping userTopping = new PremiumTopping(premiumTopping);
            toppings.add(userTopping);
            System.out.println("Would you like to add extra meat? ");
            String extraMeat = scanner.nextLine();
            Boolean userExtraMeat = true;
            if (extraMeat.equalsIgnoreCase("Yes")){
                userExtraMeat = true;
            }else if (extraMeat.equalsIgnoreCase("No")){
                userExtraMeat = false;
            }
        }
        System.out.println("Would you like some cheese? ");
        String cheeseTopping = scanner.nextLine();
        if (cheeseTopping.equalsIgnoreCase("Yes")) {
            System.out.println("Select a cheese of your choice: ");
            String cheeseChoice = scanner.nextLine();
            Topping userCheese = new PremiumTopping(cheeseChoice);
            toppings.add(userCheese);
            System.out.println("Would you like extra cheese? ");
            String extraCheese = scanner.nextLine();
            Boolean userExtraCheese = true;
            if (extraCheese.equalsIgnoreCase("Yes")){
                userExtraCheese = true;
            } else if (extraCheese.equalsIgnoreCase("No")){
                userExtraCheese = false;
            }

        }
        System.out.println("Would you like a regular topping? ");
        String regularToppingChoice = scanner.nextLine();
        if (regularToppingChoice.equalsIgnoreCase("Yes")) {
            System.out.println("Please, select the regular topping of your choice: ");
            // Display regular toppings
            String regularTopping = scanner.nextLine();
            Topping userRegTopping = new RegularToppings(regularTopping);
            toppings.add(userRegTopping);
        }
        System.out.println("Would you like a sauce? ");
        String userSauceChoice = scanner.nextLine();
        if (userSauceChoice.equalsIgnoreCase("Yes")) {
            System.out.println("Here is a list of sauces");
            //Display sauces
            String sauce = scanner.nextLine();
            Sauce userSauce = new Sauce(sauce);
            toppings.add(userSauce);
        }
        System.out.println("Would you like the bread to be toasted? ");
        String yesOrNo = scanner.nextLine();
        Boolean isToastedBread = true;
        if (yesOrNo.equalsIgnoreCase("Yes")) {
            isToastedBread = true;
        }else if (yesOrNo.equalsIgnoreCase("No")){
            isToastedBread = false;
        }



       // Sandwich sandwich = new Sandwich()
        //order.addsandwich(sandwich)


    }

    public void addDrink() {

        System.out.println("What size drink would you like? ( S | M | L )");
        String size = scanner.nextLine();

        System.out.println("Please select a drink of your choice: ");
        String flavor = scanner.nextLine();

        Drink drink = new Drink(size, flavor);
        order.addDrinkToOrder(drink);
    }


    public void addChips() {
        System.out.println("What flavor chips would you like?");
        String type = scanner.nextLine();

        Chips chips = new Chips(type);
        order.addChips(chips);
    }
}


