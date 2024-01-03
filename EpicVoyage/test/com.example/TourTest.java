package com.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
class TourTest {
    Tour tour;
    @BeforeEach
    void setUp() {
        tour = new Tour(1, "name", "description", 5);
    }
    @Test
    void testRatingInRange() {
        Assertions.assertDoesNotThrow(() -> {
            tour.setRating(5);
            tour.setRating(4);
            tour.setRating(3);
            tour.setRating(2);
            tour.setRating(1);
        });
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            tour.setRating(0);
        });
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            tour.setRating(-1);
        });
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            tour.setRating(6);
        });
    }
}