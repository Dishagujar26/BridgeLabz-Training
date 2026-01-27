package com.bl.junit.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import com.bl.junit.main.DateFormatter;

public class DateFormatterTest {

    DateFormatter formatter = new DateFormatter();

    @Test
    void testValidDate() {
        assertEquals("25-01-2026", formatter.formatDate("2026-01-25"));
    }

    @Test
    void testInvalidDate() {
        assertThrows(Exception.class, () -> formatter.formatDate("25-01-2026"));
    }
}