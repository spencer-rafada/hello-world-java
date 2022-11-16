package com.example.javamethods;

public class JavaMethods {
    static void sayHello(String fname, int age) {
        System.out.println("Hello " + fname + "! You are " + age + "!");
    }

    static int plusMethod(int x, int y) {
        return x + y;
    }

    static double plusMethod(double x, double y) {
        return x + y;
    }

    // Recursion
    public static int sum(int k) {
        if (k > 0) {
            return k + sum(k - 1);
        } else {
            return 0;
        }
    }

    public static int sumHalt (int start, int end) {
        if (end > start) {
            return end + sumHalt(start, end - 1);
        } else {
            return end;
        }
    }

    public static void main(String[] args) {
        sayHello("Spencer", 23);

        // Method Overloading
        System.out.println("int: " + plusMethod(1, 2));
        System.out.println("double: " + plusMethod(12.5, 23.5));

        // Scope
        {
            int x = 100;
            System.out.println(x);
        }

        // System.out.println(x); Error due to scope.

        // Recursion
        int result = sum(10);
        System.out.println(result);

        // Recursion with Halt
        System.out.println(sumHalt(10, 15));
    }
}
