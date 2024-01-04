package com.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

class PurchaseTest {
    Purchase checkoutReport;
    @BeforeEach
    public void setUp() {
        checkoutReport = new Purchase(1, 1,
                new Customer(1, "login", "password", "name", "address@gmail.com", "+48345665343", "address"),
                new Tour(1, "name", "description", 3, new ArrayList<>())
        );
    }
    @Test
    void testTotalPrice() {
        Assertions.assertThrowsExactly(IllegalArgumentException.class, () -> {
            checkoutReport.setTotalPrice(-100);
        });
        Assertions.assertDoesNotThrow(() -> {
            checkoutReport.setTotalPrice(0);
            checkoutReport.setTotalPrice(100);
        });
    }
}