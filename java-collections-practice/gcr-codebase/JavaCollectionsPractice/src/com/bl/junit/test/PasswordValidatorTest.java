package com.bl.junit.test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import com.bl.junit.main.PasswordValidator;

public class PasswordValidatorTest {

    PasswordValidator validator = new PasswordValidator();

    @Test
    void testValidPassword() {
        assertTrue(validator.isValid("Strong123"));
    }

    @Test
    void testInvalidPassword() {
        assertFalse(validator.isValid("weak"));
        assertFalse(validator.isValid("NoNumber"));
        assertFalse(validator.isValid("12345678"));
    }
}