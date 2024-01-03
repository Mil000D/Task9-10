package com.example;

public class Hotel extends Accommodation {
    private int stars;

    public int getStars() {
        return stars;
    }

    public void setStars(int stars) {
        if (!isStarsInRange(stars))
            throw new IllegalArgumentException("Stars must be in range 1-5");
        this.stars = stars;
    }

    public Hotel(int id, String address, String description, float rating, String phone, String email, City city, int stars) {
        super(id, address, description, rating, phone, email, city);
        this.stars = stars;
    }

    public Hotel(int id, String address, String description, float rating, String phone, String email, City city) {
        super(id, address, description, rating, phone, email, city);
    }
    private boolean isStarsInRange(int stars) {
        return stars >= 1 && stars <= 5;
    }
}
