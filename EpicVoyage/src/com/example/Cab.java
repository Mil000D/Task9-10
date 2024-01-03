package com.example;

public class Cab {
    private int id;
    private String name;
    private String description;

    public Cab(int id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
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

    public class Plane extends Cab{
        public Plane(int id, String name, String description) {
            super(id, name, description);
        }
    }
    public class Train extends Cab{
        public Train(int id, String name, String description) {
            super(id, name, description);
        }
    }
}
