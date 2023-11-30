package com.pluralsight.deli;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;


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
        String fileDateTime = year + monthDate + dayOfMonth + "-" + hour + minute + second + ".txt";

        try {
            File myFile = new File("receipts/" + fileDateTime);
            if (myFile.createNewFile()) {
                System.out.println("Order placed!");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            BufferedWriter receipt = new BufferedWriter(new FileWriter("receipts/" + fileDateTime, true));

            //receipt.write(order.toString()+  "\n");
            receipt.write("Shop Name: The Ocky Way\n");
            receipt.write("Shop Number: 718-222-8422\n");
            receipt.write(order.toString() + "\n");
            receipt.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
