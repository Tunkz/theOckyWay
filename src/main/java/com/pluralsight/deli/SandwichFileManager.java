package com.pluralsight.deli;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.List;


public class SandwichFileManager {
    public void saveSandwichShop(Order order) {

        // Generate a unique file name based on the current date and time
        String receiptName = String.format("");
        // Get the current date and time components
        
        LocalDateTime localDateTime = LocalDateTime.now();
        String dayOfMonth = localDateTime.getDayOfMonth() + "";
        String monthDate = localDateTime.getMonthValue() + "";
        String year = localDateTime.getYear() + "";
        String hour = localDateTime.getHour() + "";
        String minute = localDateTime.getMinute() + "";
        String second = localDateTime.getSecond() + "";


        // Create a formatted string for the file name
        String fileDateTime = year+ monthDate+dayOfMonth+"-"+hour+minute+second+".txt";

        try {
            // Create a new file using the generated file name
            File myFile = new File(fileDateTime);
          
        String fileDateTime = year + monthDate + dayOfMonth + "-" + hour + minute + second + ".txt";

        try {
            File myFile = new File("receipts/"+fileDateTime);

            if (myFile.createNewFile()) {
                System.out.println("Order Placed!");
            }
        } catch (IOException e) {
            // Handle file creation exceptions
            e.printStackTrace();
        }

        try {

            // Open a BufferedWriter to append content to the file
            BufferedWriter receipt = new BufferedWriter(new FileWriter(fileDateTime,true));
            receipt.write(receipt +  "\n");
            receipt.close();
            try {
                BufferedWriter writer = new BufferedWriter(new FileWriter(fileDateTime,true));
            } catch (IOException e) {
                throw new RuntimeException(e);

            BufferedWriter receipt = new BufferedWriter(new FileWriter("receipts/"+fileDateTime, true));

            //receipt.write(order.toString()+  "\n");
            receipt.write("shop name: \n");
            receipt.write("shop number");
            receipt.write(order.toString()+"\n");
            List<Sandwich> sandwiches = order.getSandwiches();
            for (Sandwich sandwich : sandwiches) {
                receipt.write(sandwich.toString()+"\n");
            }

            List<Drink> drinks = order.getDrinks();
            for (Drink drink : drinks) {
                receipt.write(drink.toString()+"\n");

            }
            List<Chips> chips = order.getChips();
            for (Chips chip : chips) {
                receipt.write(chip.toString()+"\n");
            }
            receipt.close();


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
