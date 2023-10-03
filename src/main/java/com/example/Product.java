package com.example;

public class Product {
    private String name;
    private double price;
    private int productID;

    public Product(String name, double price, int productID) {
        this.name = name;
        this.price = price;
        this.productID = productID;
        // TODO: Initialize the attributes
    }
    public String getName(){
        return this.name;
    }
    public double getPrice(){
        return this.price;
    }
    public int getProductID(){
        return this.productID;
    }
    // TODO: Implement getters, setters, and any other methods you find necessary
}
