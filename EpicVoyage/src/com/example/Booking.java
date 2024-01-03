package com.example;
import java.time.LocalDate;


public class Booking {
    private int id;
    private LocalDate startDate;
    private LocalDate endDate;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        if (startDate.isAfter(endDate))
            throw new IllegalArgumentException("Start date must be before end date");
        this.endDate = endDate;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        if (!isValidPrice(price)) {
            throw new IllegalArgumentException("Price must be positive");
        }
        this.price = price;
    }

    public Booking(int id, LocalDate startDate, LocalDate endDate, float price) {
        this.id = id;
        this.startDate = startDate;
        if (startDate.isAfter(endDate))
            throw new IllegalArgumentException("Start date must be before end date");
        this.endDate = endDate;
        if (!isValidPrice(price))
            throw new IllegalArgumentException("Price must be positive");
        this.price = price;
    }

    private float price;
    private boolean isValidPrice(float price) {
        return price >= 0;
    }

}
