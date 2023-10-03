package com.example;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Product> productslist;

    public ShoppingCart() {
        this.productslist = new ArrayList<Product>();
        // TODO: Initialize the list of products
    }
    public void addProduct(Product product){
        productslist.add(product);
    }
    public void removeProduct(Product product){
        productslist.remove(product);
    }
    public double totalCost(){
        double total = 0;
        for(Product product: productslist){
            total += product.getPrice();
        }
        return total;
    }
    // TODO: Implement methods to add a product, remove a product, and calculate the total cost
}
