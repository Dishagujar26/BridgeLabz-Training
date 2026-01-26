package com.bl.day1.triporganizerforbackpackers;
import java.io.Serializable;

public class Trip implements Serializable {
    private static final long serialVersionUID = 1L;

    String city;
    String country;
    int durationDays;
    String description;

    public Trip(String city, String country, int durationDays, String description) {
        this.city = city;
        this.country = country;
        this.durationDays = durationDays;
        this.description = description;
    }

    @Override
    public String toString() {
        return city + ", " + country + " (" + durationDays + " days)";
    }
}
