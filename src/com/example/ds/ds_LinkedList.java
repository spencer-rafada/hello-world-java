package com.example.ds;
import java.util.LinkedList;
import java.util.HashMap;

public class ds_LinkedList {
    public static void main(String[] args) {
        LinkedList<String> cars = new LinkedList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);
        // https://www.w3schools.com/java/java_linkedlist.asp
        System.out.println(cars.getLast());

        HashMap<String, String> capitalCities = new HashMap<String, String>();

        // Add key and values (Country, City)
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");
        System.out.println(capitalCities);
        System.out.println(capitalCities.get("England"));

        // Loop through hash map
        // change keySet to values to get the values instead of keys
        for (String i : capitalCities.keySet()) {
            System.out.println(i);
        }
    }
}
