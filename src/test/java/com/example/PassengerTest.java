package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PassengerTest {
    @Test
    public void testPassengerInitialization() {
        Passenger passenger = new Passenger("John Doe", "AB123456");
        assertEquals("John Doe", passenger.getName());
        assertEquals("AB123456", passenger.getPassportNumber());
    }
}
