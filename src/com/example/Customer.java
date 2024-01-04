package com.example;

import java.util.List;

public class Customer extends User {
    private List<Purchase> purchases;

    public Customer(int id, String login, String password, String name, String email, String phone, String address) {
        super(id, login, password, name, email, phone, address);
    }
    public List<Purchase> getBookedTours() {
        return purchases;
    }

    public void setBookedTours(List<Purchase> bookedTours) {
        this.purchases = bookedTours;
    }
}
