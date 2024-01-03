package com.example;

public class CheckoutReport {
    private int id;
    private float totalPrice;
    private Customer customer;
    private Tour tour;

    public CheckoutReport(int id, float totalPrice) {
        this.id = id;
        if (!isValidTotalPrice(totalPrice))
            throw new IllegalArgumentException("Total price must be positive");
        this.totalPrice = totalPrice;
    }

    public int getId() {
        return id;
    }

    public float getTotalPrice() {
        return totalPrice;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTotalPrice(float totalPrice) {
        if (!isValidTotalPrice(totalPrice))
            throw new IllegalArgumentException("Total price must be positive");
        this.totalPrice = totalPrice;
    }

    private enum paymentMethod {CASH, CARD, TRANSFER}

    public boolean buyTour(Tour tour, Customer customer) {
        return true;
    }
    private boolean isValidTotalPrice(float totalPrice) {
        return totalPrice >= 0;
    }
}
