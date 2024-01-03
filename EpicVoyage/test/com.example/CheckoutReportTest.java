package com.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CheckoutReportTest {
    CheckoutReport checkoutReport;
    @BeforeEach
    public void setUp() {
        checkoutReport = new CheckoutReport(1, 1);
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