package com.example;

public class User {
    private int id;
    private String login;
    private String password;
    private String name;
    private String email;
    private String phone;
    private String address;

    public User(int id, String login, String password, String name, String email, String phone, String address) {
        this.id = id;
        this.login = login;
        this.password = password;
        this.name = name;
        if (!isValidEmail(email))
            throw new IllegalArgumentException("Email should be in format email@expl.com");
        this.email = email;
        if (!isValidPhone(phone))
            throw new IllegalArgumentException("Phone should be in format +123456789");
        this.phone = phone;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        if (!isValidEmail(email))
            throw new IllegalArgumentException("Email should be in format email@expl.com");
        this.email = email;
    }

    public void setPhone(String phone) {
        if (!isValidPhone(phone))
            throw new IllegalArgumentException("Phone should be in format +123456789");
        this.phone = phone;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public static boolean correctUsername() {
        return true;
    }
    public boolean login(String login, String password) {
        return true;
    }
    public boolean logout() {
        return true;
    }
    public void notifyUser() {}
    private boolean isValidPhone(String phone) {
        return phone.matches("^\\+\\d{9,11}$");
    }
    private boolean isValidEmail(String email) {
        return email.matches("^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\\.[a-zA-Z0-9-.]+$");
    }
}
