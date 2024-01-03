package com.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {
    User user;
    @BeforeEach
    void setUp() {
        user = new User(1, "login", "password", "name", "address@gmail.com", "+48345665343", "address");
    }
    @Test
    void testPhone() {
        Assertions.assertDoesNotThrow(() -> {
            user.setPhone("+4812341234");
            user.setPhone("+48123412345");
        });
        Assertions.assertThrowsExactly(IllegalArgumentException.class, () -> {
            user.setPhone("32345235423452354234523452345325");
        });
        Assertions.assertThrowsExactly(IllegalArgumentException.class, () -> {
            user.setPhone("1");
        });
        Assertions.assertThrowsExactly(IllegalArgumentException.class, () -> {
            user.setPhone("-12345125");
        });
        Assertions.assertThrowsExactly(IllegalArgumentException.class, () -> {
            user.setPhone("adsfasdfasd");
        });
    }
    @Test
    void testEmail() {
        Assertions.assertThrowsExactly(IllegalArgumentException.class, () -> {
            user.setEmail("1234");
        });
        Assertions.assertThrowsExactly(IllegalArgumentException.class, () -> {
            user.setEmail("email");
        });
        Assertions.assertThrowsExactly(IllegalArgumentException.class, () -> {
            user.setEmail("example@m.");
        });
        Assertions.assertThrowsExactly(IllegalArgumentException.class, () -> {
            user.setEmail("example@m");
        });

        Assertions.assertDoesNotThrow(() -> {
            user.setEmail("example@m.com");
        });
    }
}