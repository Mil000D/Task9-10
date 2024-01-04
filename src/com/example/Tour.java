package com.example;

import java.util.Date;
import java.util.List;

public class Tour {
    private int id;
    private int rating;
    private String name;
    private String description;

    public Tour(int id, int rating, String name, String description, List<AccommodationBooking> accommodationBookings, List<CabBooking> cabBookings, List<Purchase> purchases) {
        this.id = id;
        this.rating = rating;
        this.name = name;
        this.description = description;
        this.accommodationBookings = accommodationBookings;
        this.cabBookings = cabBookings;
        this.purchases = purchases;
    }

    public List<AccommodationBooking> getAccommodationBookings() {
        return accommodationBookings;
    }

    public void setAccommodationBookings(List<AccommodationBooking> accommodationBookings) {
        this.accommodationBookings = accommodationBookings;
    }

    private List<AccommodationBooking> accommodationBookings;
    private List<CabBooking> cabBookings;
    private List<Purchase> purchases;


    public Tour(int id, int rating, String name, String description, List<CabBooking> cabBookings, List<Purchase> purchases) {
        this.id = id;
        this.rating = rating;
        this.name = name;
        this.description = description;
        this.cabBookings = cabBookings;
        this.purchases = purchases;
    }

    public List<CabBooking> getCabBookings() {
        return cabBookings;
    }

    public void setCabBookings(List<CabBooking> cabBookings) {
        this.cabBookings = cabBookings;
    }


    public List<Purchase> getPurchases() {
        return purchases;
    }

    public void setPurchases(List<Purchase> purchases) {
        this.purchases = purchases;
    }



    public static List<Tour> getToursWithinTime(Date start, Date end) {
        return null;
    }

    public boolean updateTour(Tour tour) {
        return false;
    }
    public boolean deleteTour(int id) {
        return false;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        if (!isRatingInRange(rating))
            throw new IllegalArgumentException("Rating must be in range 1-5");
        this.rating = rating;
    }

    public Tour(int id, String name, String description, int rating, List<Purchase> purchases) {
        this.id = id;
        this.name = name;
        this.description = description;
        if (!isRatingInRange(rating))
            throw new IllegalArgumentException("Rating must be in range 1-5");
        this.rating = rating;
        this.purchases = purchases;
    }
    private boolean isRatingInRange(int rating) {
        return rating >= 1 && rating <= 5;
    }

}
