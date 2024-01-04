package com.example;

public class Purchase {
    private int id;
    private float totalPrice;
    private Customer customer;

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Tour getTour() {
        return tour;
    }

    public void setTour(Tour tour) {
        this.tour = tour;
    }

    private Tour tour;

    public Purchase(int id, float totalPrice, Customer customer, Tour tour) {
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
