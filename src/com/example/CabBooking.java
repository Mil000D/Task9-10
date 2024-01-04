package com.example;

import java.time.LocalDate;

public class CabBooking extends Booking {
    private String fromLocation;
    private String toLocation;
    private Tour tour;
    private Cab cab;

    public String getFromLocation() {
        return fromLocation;
    }

    public void setFromLocation(String fromLocation) {
        this.fromLocation = fromLocation;
    }

    public String getToLocation() {
        return toLocation;
    }

    public void setToLocation(String toLocation) {
        this.toLocation = toLocation;
    }

    public Tour getTour() {
        return tour;
    }

    public void setTour(Tour tour) {
        this.tour = tour;
    }

    public Cab getCab() {
        return cab;
    }

    public void setCab(Cab cab) {
        this.cab = cab;
    }

    public CabBooking(int id, LocalDate startDate, LocalDate endDate, float price, String fromLocation, String toLocation, Tour tour, Cab cab) {
        super(id, startDate, endDate, price);
        this.fromLocation = fromLocation;
        this.toLocation = toLocation;
        this.tour = tour;
        this.cab = cab;
    }

    public CabBooking(int id, LocalDate startDate, LocalDate endDate, float price) {
        super(id, startDate, endDate, price);
    }
}
