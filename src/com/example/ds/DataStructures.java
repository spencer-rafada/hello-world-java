package com.example.ds;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;

public class DataStructures {
    public static void main(String[] args) {
        // Date and Time
        LocalDate myDate = LocalDate.now();
        System.out.println(myDate);
        LocalTime myTime = LocalTime.now();
        System.out.println(myTime);
        LocalDateTime myDateTime = LocalDateTime.now();
        System.out.println(myDateTime);

        // Formatting
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedDate = myDateTime.format(myFormatObj);
        System.out.println(formattedDate);

        // ArrayList
        ArrayList<String> cars = new ArrayList<String>();

        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);

        System.out.println("\n Print using For Loop");
        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));
        }

        // Sort
        Collections.sort(cars);
        System.out.println("\n Print using ForEach Loop");
        for (String i: cars) {
            System.out.println(i);
        }

        System.out.println();
        System.out.println(cars.get(0));
        cars.set(0, "Ferrari");
        System.out.println(cars.get(0));
        cars.remove(0);
        System.out.println(cars.size());
        cars.clear();
        System.out.println(cars.size());
    }
}
