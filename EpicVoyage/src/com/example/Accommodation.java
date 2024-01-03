package com.example;

import com.example.City;

import java.util.Date;

public class Accommodation {
    private int id;
    private String address;
    private String description;
    private float rating;
    private String phone;
    private String email;

    public boolean bookAccommodation(Date startDate, Date endDate) {
        return true;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        if (!isValidRating(rating))
            throw new IllegalArgumentException("Rating should be between 1 and 5");
        this.rating = rating;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        if (!isValidPhone(phone))
            throw new IllegalArgumentException("Phone should be in format +123456789");
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (!isValidEmail(email))
            throw new IllegalArgumentException("Email should be in format email@exmpl.com");
        this.email = email;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public Accommodation(int id, String address, String description, float rating, String phone, String email, City city) {
        this.id = id;
        this.address = address;
        this.description = description;
        if (!isValidRating(rating))
            throw new IllegalArgumentException("Rating should be between 1 and 5");
        this.rating = rating;
        if (!isValidPhone(phone))
            throw new IllegalArgumentException("Phone should be in format +123456789");
        this.phone = phone;
        if (!isValidEmail(email))
            throw new IllegalArgumentException("Email should be in format email@expl.com");
        this.email = email;
        this.city = city;
    }

    private City city;

    private boolean isValidPhone(String phone) {
        return phone.matches("^\\+\\d{9,11}$");
    }
    private boolean isValidRating(float rating) {
        return rating >= 1 && rating <= 5;
    }
    private boolean isValidEmail(String email) {
        return email.matches("^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\\.[a-zA-Z0-9-.]+$");
    }
}
