package com.bl.junit.test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import com.bl.junit.main.UserRegistration;

public class UserRegistrationTest {

    UserRegistration reg = new UserRegistration();

    @Test
    void testValidRegistration() {
        assertDoesNotThrow(() ->
            reg.registerUser("username", "user@mail.com", "Password1")
        );
    }

    @Test
    void testInvalidRegistration() {
        assertThrows(IllegalArgumentException.class, () ->
            reg.registerUser("usr", "invalidmail", "pass")
        );
    }
}