package com.pluralsight.deli;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;


public class SandwichFileManager {
    public void saveSandwichShop(SandwichShop sandwichShop) {

        String receiptName = String.format("");
        LocalDateTime localDateTime = LocalDateTime.now();
        String dayOfMonth = localDateTime.getDayOfMonth() + "";
        String monthDate = localDateTime.getMonthValue() + "";
        String year = localDateTime.getYear()+ "";
        String hour = localDateTime.getHour()+ "";
        String minute = localDateTime.getMinute()+ "";
        String second = localDateTime.getSecond()+ "";

        String fileDateTime = year+ monthDate+dayOfMonth+"-"+hour+minute+second+".txt";

        try {
            File myFile = new File(fileDateTime);
            if (myFile.createNewFile()) {
                System.out.println("Order Placed!");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            BufferedWriter receipt = new BufferedWriter(new FileWriter(fileDateTime,true));
            receipt.write(receipt +  "\n");
            receipt.close();
            try {
                BufferedWriter writer = new BufferedWriter(new FileWriter(fileDateTime,true));
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
