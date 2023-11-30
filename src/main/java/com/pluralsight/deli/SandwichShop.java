package com.pluralsight.deli;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SandwichShop {

    private final Scanner scanner = new Scanner(System.in);
    private List<Sandwich> sandwiches = new ArrayList<>();
    private List<Drink> drinks = new ArrayList<>();
    private List<Chips> chips = new ArrayList<>();
    private Order order = new Order(sandwiches, drinks, chips);


    public void mainMenu() {
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
        boolean running = true;
        while (running) {
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
                    running = false;
                    break;
                default:
                    System.out.println("Error! Please select the right option from the provided ones!");


            }
        }


    }


    public void orderScreen() {
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

            String input1 = scanner.nextLine().trim();
            switch (input1.toUpperCase()) {
                case "1":
                    processAddSandwich();
                    break;
                case "2":
                    addDrink();
                    break;
                case "3":
                    addChips();
                    break;
                case "4":
                    checkOut();
                    running = false;
                    break;
                case "X":
                    cancelOrder();
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
        BreadTypes breadTypes = new BreadTypes();
        breadTypes.breadTypes();
        //System.out.println("U+1F449");
        String breadType = scanner.nextLine();

        System.out.println("Please, select a size: ");
        Sizes sizes = new Sizes();
        sizes.sizeInInches();
        int breadSize = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Would you like a topping? ");
        List<Topping> toppings = new ArrayList<>();
        Boolean userExtraMeat = true;
        String topping = scanner.nextLine();
        if (topping.equalsIgnoreCase("Yes")) {
            System.out.println("Select a meat of your choice: ");
            // Display premium toppings
            PremiumTopping premiumToppingTemp = new PremiumTopping();
            List<PremiumTopping> premiumToppings = premiumToppingTemp.getPremiumToppings();
            for (Topping x : premiumToppings) {
                System.out.println(x.getName());
            }
            String premiumTopping = scanner.nextLine();
            Topping userTopping = new PremiumTopping(premiumTopping);
            toppings.add(userTopping);
            System.out.println("Would you like to add extra meat? ");
            String extraMeat = scanner.nextLine();

            if (extraMeat.equalsIgnoreCase("Yes")) {
                userExtraMeat = true;
            } else if (extraMeat.equalsIgnoreCase("No")) {
                userExtraMeat = false;
            }
        }
        System.out.println("Would you like some cheese? ");
        Boolean userExtraCheese = true;
        String cheeseTopping = scanner.nextLine();
        if (cheeseTopping.equalsIgnoreCase("Yes")) {
            System.out.println("Select a cheese of your choice: ");
            String cheeseChoice = scanner.nextLine();
            Topping userCheese = new PremiumTopping(cheeseChoice);
            toppings.add(userCheese);
            System.out.println("Would you like extra cheese? ");
            String extraCheese = scanner.nextLine();

            if (extraCheese.equalsIgnoreCase("Yes")) {
                userExtraCheese = true;
            } else if (extraCheese.equalsIgnoreCase("No")) {
                userExtraCheese = false;
            }

        }
        System.out.println("Would you like a regular topping? ");
        String regularToppingChoice = scanner.nextLine();
        if (regularToppingChoice.equalsIgnoreCase("Yes")) {
            System.out.println("Please, select the regular topping of your choice: ");
            // Display premium toppings

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
        } else if (yesOrNo.equalsIgnoreCase("No")) {
            isToastedBread = false;
        }

        Sandwich sandwich = new Sandwich(breadSize, breadType, toppings, isToastedBread, userExtraCheese, userExtraMeat);
        order.addSandwichToOrder(sandwich);


    }

    public void addDrink() {
        String sizes;
        while (true) {
            System.out.println("What size of drink would you like? ( S | M | L )");
            sizes = scanner.nextLine();
            if (sizes.equalsIgnoreCase("S") || sizes.equalsIgnoreCase("M") || sizes.equalsIgnoreCase("L")) {
                break;
            } else {
                System.out.println("Please select the right character!");
            }
        }
        System.out.println("Please select a drink of your choice: ");
        String flavor = scanner.nextLine();

        Drink drink = new Drink(sizes, flavor);
        order.addDrinkToOrder(drink);
    }

    public void addChips() {
        System.out.println("What flavor of chips would you like?");
        String type = scanner.nextLine();

        Chips chips = new Chips(type);
        order.addChips(chips);
    }

    public void checkOut() {


        SandwichFileManager sandwichFileManager = new SandwichFileManager();
        sandwichFileManager.saveSandwichShop(order);
        System.out.println("Order has been checked out!");

    }


    public void cancelOrder() {
        // cancel any items in bag/delete
        //reroute user to main menu to exit application
        System.out.println("Are you sure you want to cancel your order? ( Y | N )");
        String confirmation = scanner.nextLine();

        if (confirmation.equalsIgnoreCase("Y")) {
            order.setSandwiches(null);
            order.setDrinks(null);
            order.setChips(null);
            System.out.println("Order canceled successfully!");

            boolean returnToMainMenu = true;

            while (returnToMainMenu) {
                System.out.println("Return to Main Menu? ( Y | N ): ");
                String input = scanner.nextLine().trim();

                if (input.equalsIgnoreCase("Y")) {
                    returnToMainMenu = false;
                } else if (input.equalsIgnoreCase("N")) {
                    System.out.println("Exiting the application. Goodbye hope to see you again!");
                    System.exit(0);
                } else {
                    System.out.println("Invalid option. Please try again.");
                }
            }

        } else {
            System.out.println("Order cancellation aborted.");
        }
    }
}





