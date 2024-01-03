package com.example;

import java.util.Date;
import java.util.List;

public class Tour {
    private int id;
    private static List<Tour> tours;
    private int rating;
    private String name;
    private String description;

    public static List<Tour> getTours() {
        return tours;
    }
    public static Tour getTour(int id) {
        return tours.get(id);
    }
    public static boolean addTour(Tour tour) {
        return tours.add(tour);
    }
    public static List<Tour> getToursWithinTime(Date start, Date end) {
        return null;
    }
    public static void setTours(List<Tour> tours) {
        Tour.tours = tours;
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

    public Tour(int id, String name, String description, int rating) {
        this.id = id;
        this.name = name;
        this.description = description;
        if (!isRatingInRange(rating))
            throw new IllegalArgumentException("Rating must be in range 1-5");
        this.rating = rating;
    }
    private boolean isRatingInRange(int rating) {
        return rating >= 1 && rating <= 5;
    }

}
