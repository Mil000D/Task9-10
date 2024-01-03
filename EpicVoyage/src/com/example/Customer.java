package com.example;

import java.util.List;

public class Customer extends User {
    private List<Tour> bookedTours;

    public Customer(int id, String login, String password, String name, String email, String phone, String address) {
        super(id, login, password, name, email, phone, address);
    }
    public List<Tour> getBookedTours() {
        return bookedTours;
    }

    public void setBookedTours(List<Tour> bookedTours) {
        this.bookedTours = bookedTours;
    }
}
