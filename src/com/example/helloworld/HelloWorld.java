package com.example.helloworld;

public class HelloWorld {
    public static void main(String[] args) {
        String f_name = "Spencer", l_name = "Rafada";
        // This is a comment
        System.out.println(f_name + " " + l_name);

        int x = 3;
        int y = 5;
        System.out.println(x + y);

        char myLetter = 'A';
        System.out.println(myLetter);

        // Variables
        byte myByte = 100;   // byte -128 to 127
        short myShort = 5000; // short -32768 + 32767
        int myInt = 10000;
        long myLong = 12345;
        float myFloat = 1.23f;
        double myDbl = 12.3d;
        boolean isJavaFun = true;
        boolean isFishTasty = false;
        char myChar1 = 65, myChar2 = 'B';
        String myString = "Hello World!";

        // Widening Casting (automatic)
        int intCasting = 9;
        double dblCasting = intCasting;

        System.out.println("Widening Casting: " + dblCasting);

        // Narrowing Casting (manual)
        double dblCasting2 = 9.78d;
        int intCasting2 = (int) dblCasting2;

        System.out.println("Narrowing Casting: " + intCasting2);

        // Loops
        System.out.println("While Loop");
        int i = 0;
        while(i < 5) {
            System.out.println(i);
            i++;
        }

        System.out.println("Do/While Loop");
        i = 0;
        do {
            System.out.println(i);
            i++;
        } while (i < 5);

        System.out.println("For Loop");
        for (int j = 0; j < 5; j++) {
            System.out.println(j);
        }

        System.out.println("ForEach Loop");
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String s: cars) {
            System.out.println(s);
        }
        System.out.println("Length of Cars: " + cars.length);

        System.out.println("Multidimensional Arrays");
        int[][] myNumbers = {{1,2,3,4}, {5,6,7}};
        for (int i1 = 0; i1 < myNumbers.length; i1++) {
            for (int j1 = 0; j1 < myNumbers[i1].length; j1++) {
                System.out.println(myNumbers[i1][j1]);
            }
        }


    }
}
