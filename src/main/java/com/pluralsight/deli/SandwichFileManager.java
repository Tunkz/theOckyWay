package com.pluralsight.deli;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.List;


public class SandwichFileManager {
    public void saveSandwichShop(Order order) {

        String receiptName = String.format("");
        LocalDateTime localDateTime = LocalDateTime.now();
        String dayOfMonth = localDateTime.getDayOfMonth() + "";
        String monthDate = localDateTime.getMonthValue() + "";
        String year = localDateTime.getYear() + "";
        String hour = localDateTime.getHour() + "";
        String minute = localDateTime.getMinute() + "";
        String second = localDateTime.getSecond() + "";

        String fileDateTime = year + monthDate + dayOfMonth + "-" + hour + minute + second + ".txt";

        try {
            File myFile = new File("receipts/"+fileDateTime);
            if (myFile.createNewFile()) {
                System.out.println("Order Placed!");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
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
