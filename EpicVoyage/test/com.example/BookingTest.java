package com.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

class BookingTest {
    Booking booking;
    @BeforeEach
    void setUp() {
        booking = new Booking(1, LocalDate.of(2024, 1, 1),
                LocalDate.of(2024, 1, 1), 100);
    }
    @Test
    void testDate() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            booking.setStartDate(LocalDate.of(2021, 1, 1));
            booking.setEndDate(LocalDate.of(2020, 1, 1));
        });

        Assertions.assertDoesNotThrow(() -> {
            booking.setStartDate(LocalDate.of(2020, 1, 1));
            booking.setEndDate(LocalDate.of(2021, 1, 1));
        });
    }
    @Test
    void testPrice() {
        Assertions.assertThrowsExactly(IllegalArgumentException.class, () -> {
            booking.setPrice(-100);
        });
        Assertions.assertDoesNotThrow(() -> {
            booking.setPrice(100);
            booking.setPrice(0);
        });
    }
}