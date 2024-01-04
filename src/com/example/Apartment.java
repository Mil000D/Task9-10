package com.example;

public class Apartment extends Accommodation {
    Owner owner;

    public Apartment(int id, String address, String description, float rating, String phone, String email, City city, Owner owner) {
        super(id, address, description, rating, phone, email, city);
        this.owner = owner;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public Apartment(int id, String address, String description, float rating, String phone, String email, City city) {
        super(id, address, description, rating, phone, email, city);
    }
    public boolean registerApartment(){
        return true;
    }
}
