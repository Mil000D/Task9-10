package com.example;

import java.time.LocalDate;
import java.util.Date;

public class AccommodationBooking extends Booking {
    private enum roomType{SINGLE, DOUBLE, LUX}
    Tour tour;
    Accommodation accommodation;


    public Tour getTour() {
        return tour;
    }

    public void setTour(Tour tour) {
        this.tour = tour;
    }

    public Accommodation getAccommodation() {
        return accommodation;
    }

    public void setAccommodation(Accommodation accommodation) {
        this.accommodation = accommodation;
    }

    public AccommodationBooking(int id, LocalDate startDate, LocalDate endDate, float price, Tour tour, Accommodation accommodation) {
        super(id, startDate, endDate, price);
        this.tour = tour;
        this.accommodation = accommodation;
    }
    public AccommodationBooking(int id, LocalDate startDate, LocalDate endDate, float price) {
        super(id, startDate, endDate, price);
    }
}
