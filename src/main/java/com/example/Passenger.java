package com.example;

public class Passenger {
    private String name;
    private String passportNumber;

    public Passenger(String name, String passportNumber) {
        this.name = name;
        this.passportNumber = passportNumber;
        // TODO: Initialize the attributes
    }
    public String getName(){
        return this.name;
    }
    public String getPassportNumber(){
        return this.passportNumber;
    }

    // TODO: Implement getters, setters, and any other methods you find necessary
}
