package com.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class AccommodationTest {
    Accommodation accommodation;

    @BeforeEach
    public void setUp() {
        accommodation = new Accommodation(1, "qr", "description", 5,
                "+48345665343", "address@gmail.com",
                new City(1, "city",
                        new Country(1, "country")));
    }
    @Test
    void testRatingInRange() {
        Assertions.assertDoesNotThrow(() -> {
            accommodation.setRating(3);
            accommodation.setRating(3.5f);
        });
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            accommodation.setRating(0);
        });
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            accommodation.setRating(-1);
        });
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            accommodation.setRating(6);
        });
    }
    @Test
    void testPhone() {
        Assertions.assertDoesNotThrow(() -> {
            accommodation.setPhone("+4812341234");
            accommodation.setPhone("+48123412345");
        });
        Assertions.assertThrowsExactly(IllegalArgumentException.class, () -> {
            accommodation.setPhone("32345235423452354234523452345325");
        });
        Assertions.assertThrowsExactly(IllegalArgumentException.class, () -> {
            accommodation.setPhone("1");
        });
        Assertions.assertThrowsExactly(IllegalArgumentException.class, () -> {
            accommodation.setPhone("-12345125");
        });
        Assertions.assertThrowsExactly(IllegalArgumentException.class, () -> {
            accommodation.setPhone("adsfasdfasd");
        });

    }
    @Test
    void testEmail() {
        Assertions.assertThrowsExactly(IllegalArgumentException.class, () -> {
            accommodation.setEmail("1234");
        });
        Assertions.assertThrowsExactly(IllegalArgumentException.class, () -> {
            accommodation.setEmail("email");
        });
        Assertions.assertThrowsExactly(IllegalArgumentException.class, () -> {
            accommodation.setEmail("example@m.");
        });
        Assertions.assertThrowsExactly(IllegalArgumentException.class, () -> {
            accommodation.setEmail("example@m");
        });

        Assertions.assertDoesNotThrow(() -> {
            accommodation.setEmail("example@m.com");
        });
    }
}
