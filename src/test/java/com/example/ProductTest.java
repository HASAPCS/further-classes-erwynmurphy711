package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProductTest {
    @Test
    public void testProductInitialization() {
        Product product = new Product("Sample Product", 9.99, 1);
        assertEquals("Sample Product", product.getName());
        assertEquals(9.99, product.getPrice());
        assertEquals(1, product.getProductID());
    }
}
