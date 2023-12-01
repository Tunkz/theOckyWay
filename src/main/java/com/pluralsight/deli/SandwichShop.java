package com.pluralsight.deli;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SandwichShop {

    private final Scanner scanner = new Scanner(System.in);
    private List<Sandwich> sandwiches = new ArrayList<>();
    private List<Drink> drinks = new ArrayList<>();
    private List<Chips> chips = new ArrayList<>();
    private Order order = new Order();


    public void mainMenu() {
        try {
            Thread.sleep(10);


            System.out.println("┌──────────────────────────────────────────────────────┐\n" +
                    "│                                                      │\n" +
                    "│                                                      │\n" +
                    "│                                                      │\n" +
                    "│        Hello! Welcome to the Sandwich shop!          │\n" +
                    "│                                                      │\n" +
                    "│                                                      │\n" +
                    "│                                                      │\n" +
                    "└──────────────────────────────────────────────────────┘");

            //Display welcome message and menu options
            // prompts user to start order
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

        } catch (Exception e) {

        }


    }

    //
    public void orderScreen() {
        boolean running = true;
        while (running) {
            try {
                Thread.sleep(2000);

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
                //Display the order screen with different options
                //Prompts the User to add either a sandwich,drink, or chips to their order or checkout or cancel
                //Based on User's input calls on next method

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

            } catch (Exception e) {

            }

        }
    }

    public void processAddSandwich() {
        // Prompt the user to customize a sandwich
        System.out.println("Please, select the type of bread you want \nWhite\nWheat\nrye\nwrap");
        //System.out.println("U+1F449");

        String breadType = scanner.nextLine();

        System.out.println("Please, select a size(4\", 6\", 12\"):");

        int size = scanner.nextInt();
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
            Topping userTopping = new PremiumTopping(premiumTopping, true);

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
            PremiumTopping CheeseTopping = new PremiumTopping();
            List<PremiumTopping> Cheese = CheeseTopping.getCheesePremiumTopping();
            for (PremiumTopping x : Cheese) {
                System.out.println(x.getName());
            }
            String cheeseChoice = scanner.nextLine();
            Topping userCheese = new PremiumTopping(cheeseChoice, false);
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
            RegularToppings RegularToppings = new RegularToppings("");
            List<RegularToppings> freeToppings = RegularToppings.getRegularToppings();
            for (RegularToppings x : freeToppings){
                System.out.println(x.getName());
            }

            String regularTopping = scanner.nextLine();
            Topping userRegTopping = new RegularToppings(regularTopping);
            toppings.add(userRegTopping);
        }
        System.out.println("Would you like a sauce? ");
        String userSauceChoice = scanner.nextLine();
        if (userSauceChoice.equalsIgnoreCase("Yes")) {
            System.out.println("Here is a list of sauces");
            //Display sauces
            /* Sauce sauce = new Sauce(String);
            List<Sauce> sauces = sauce.getSauce();
            for (Sauce x : sauces) {
                System.out.println(x.getName());
            }*/
            Sauce sauces = new Sauce("");
            List<Sauce> sauce = sauces.getSauce();
            for (Sauce x : sauce) {
                System.out.println(x.getName());
            }
            String sauceInput = scanner.nextLine();
            Sauce userSauce = new Sauce("");
            toppings.add(userSauce);
        }
        System.out.println("Would you like the bread to be toasted? ");
        //Give User option to toast bread or leave untoasted
        String yesOrNo = scanner.nextLine();
        Boolean isToastedBread = true;
        if (yesOrNo.equalsIgnoreCase("Yes")) {
            isToastedBread = true;
        } else if (yesOrNo.equalsIgnoreCase("No")) {
            isToastedBread = false;
        }

        Sandwich sandwich = new Sandwich(size, breadType, isToastedBread, userExtraCheese, userExtraMeat);
        order.addSandwichToOrder(sandwich);

        System.out.println("Your sandwich has been added to the order!\n");
    }

    public void addDrink() {
        //Prompts user to add drink
        String sizes;
        while (true) {
            System.out.println("What size of drink would you like? ( S | M | L )");
            sizes = scanner.nextLine();
            // Asks User for size of drink
            if (sizes.equalsIgnoreCase("S") || sizes.equalsIgnoreCase("M") || sizes.equalsIgnoreCase("L")) {
                break;
            } else {
                System.out.println("Please select the right character!");
            }
        }
        System.out.println("Please select a drink of your choice: \ncoke\nfanta\nsprite");
//        Drink drinkable = new Drink("");
//        List<Drink> drinks = drinkable.getDrinks();
//        for (Drink x : drinks){
//            System.out.println(x);
//        }
        String flavor = scanner.nextLine();

        Drink drink = new Drink(sizes, flavor);
        order.addDrinkToOrder(drink);
    }

    public void addChips() {
        System.out.println("What flavor of chips would you like?");
        Chips chips = new Chips("");

        // Prompt the user to select the flavor of chips
        List<Chips> Chip = chips.getChips();
        for (Chips x : Chip){
            System.out.println(x);
        }
        String type = scanner.nextLine();
        order.addChips(chips);
    }

    public void checkOut() {
        // Save the current order details to a file using SandwichFileManager
        // Print a confirmation message indicating the order has been checked out


        SandwichFileManager sandwichFileManager = new SandwichFileManager();
        sandwichFileManager.saveSandwichShop(order);
        System.out.println("Order has been checked out!\n");

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
            // If confirmed, set sandwich, drink, and chips lists to null, print a cancellation message
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