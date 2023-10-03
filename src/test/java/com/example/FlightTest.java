package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FlightTest {
    @Test
    public void testFlightInitializationAndBooking() {
        Flight flight = new Flight("FL123", "NYC", "LA");
        assertEquals("FL123", flight.getFlightNumber());
        assertEquals("LA", flight.getOrigin());
        assertEquals("NYC", flight.getDestination());

        Passenger passenger = new Passenger("John Doe", "AB123456");
        flight.bookPassenger(passenger);
        assertEquals(1, flight.getPassengers().size());
        assertEquals(passenger, flight.getPassengers().get(0));
    }

}
