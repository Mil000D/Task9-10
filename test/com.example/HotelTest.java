package com.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HotelTest {
    Hotel hotel;
    @BeforeEach
    void setUp() {
        hotel = new Hotel(1, "address", "description", 5, "+48345665343", "address@gmail.com",
                new City(1, "city", new Country(1, "country")), 5);
    }

    @Test
    void testStars() {
        Assertions.assertDoesNotThrow(() -> hotel.setStars(5));
        Assertions.assertDoesNotThrow(() -> hotel.setStars(4));
        Assertions.assertDoesNotThrow(() -> hotel.setStars(3));
        Assertions.assertDoesNotThrow(() -> hotel.setStars(2));
        Assertions.assertDoesNotThrow(() -> hotel.setStars(1));
        Assertions.assertThrows(IllegalArgumentException.class, () -> hotel.setStars(0));
        Assertions.assertThrows(IllegalArgumentException.class, () -> hotel.setStars(-1));
        Assertions.assertThrows(IllegalArgumentException.class, () -> hotel.setStars(6));

    }

}