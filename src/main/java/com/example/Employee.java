package com.example;

public class Employee {
    private String name;
    private int id;
    private double salary;
    private String department;

    public Employee(String name, int id, double salary, String department) {
        this.name = name ;
        this.id = id;
        this.salary = salary;
        this.department = department;
        // TODO: Initialize the attributes
    }
    public String getName(){
        return this.name;
    }
    public int getId(){
        return this.id;
    }
    public double getSalary(){
        return this.salary;
    }
    public String getDepartment(){
        return this.department;
    }
    // TODO: Implement getters, setters, and any other methods you find necessary
}
