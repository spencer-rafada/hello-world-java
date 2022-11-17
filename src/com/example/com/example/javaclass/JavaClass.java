package com.example.com.example.javaclass;
import java.util.Scanner;

public class JavaClass {
    int x = 5;

    // static methods can be accessed without objects
    static void myMethod() {
        System.out.println("Hello World! I'm from a method.");
    }

    // public methods need objects to be accessed
    public void publicMethod() {
        System.out.println("I am a public method");
    }

    public static void main(String[] args) {
        JavaClass myObj = new JavaClass();
        JavaClass2 myObj2 = new JavaClass2();
        System.out.println(myObj.x);
        System.out.println(myObj2.x);
        myObj2.x = 20;
        // myObj2.y = 30; -- Error because y is final in class declaration
        System.out.println(myObj2.x);

        System.out.println("Name: " + myObj2.fname + " " + myObj2.lname);
        System.out.println("Age: " + myObj2.age);

        myMethod();
        myObj.publicMethod();

        myCar car = new myCar();
        car.fullThrottle();
        car.speed(200);

        // Java Constructors & Encapsulation
        Student student1 = new Student();
        System.out.println(student1.getName());
        student1.setName("Neil");
        System.out.println(student1.getName());
        Student student2 = new Student("Hana");
        System.out.println(student2.getName());

        // Java Packages
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter username: ");
        String userName = scanner.nextLine();
        System.out.print("Enter age: ");
        int age = scanner.nextInt();

        System.out.println("Username is " + userName);
        System.out.println("Age is " + age);

    }
}
