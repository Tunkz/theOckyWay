package com.pluralsight.deli;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;


public class SandwichFileManager {
    public void saveSandwichShop(SandwichShop sandwichShop) {

        // Generate a unique file name based on the current date and time
        String receiptName = String.format("");
        // Get the current date and time components
        
        LocalDateTime localDateTime = LocalDateTime.now();
        String dayOfMonth = localDateTime.getDayOfMonth() + "";
        String monthDate = localDateTime.getMonthValue() + "";
        String year = localDateTime.getYear()+ "";
        String hour = localDateTime.getHour()+ "";
        String minute = localDateTime.getMinute()+ "";
        String second = localDateTime.getSecond()+ "";

        // Create a formatted string for the file name
        String fileDateTime = year+ monthDate+dayOfMonth+"-"+hour+minute+second+".txt";

        try {
            // Create a new file using the generated file name
            File myFile = new File(fileDateTime);
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
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
