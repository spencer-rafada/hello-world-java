package com.example.com.example.javaclass;

public class Student {
    private String fname;

    // Getter
    public String getName() {
        return fname;
    }

    // Setter
    public void setName(String newName) {
        this.fname = newName;
    }

    // Constructor
    public Student() {
        fname = "Spencer";
    }

    public Student(String name) {
        fname = name;
    }
}
