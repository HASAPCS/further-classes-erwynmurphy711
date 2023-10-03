package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ShoppingCartTest {
    @Test
    public void testAddAndTotalCost() {
        ShoppingCart cart = new ShoppingCart();
        Product product1 = new Product("Product 1", 10, 1);
        Product product2 = new Product("Product 2", 5, 2);
        cart.addProduct(product1);
        cart.addProduct(product2);
        assertEquals(15, cart.totalCost());
    }

}
