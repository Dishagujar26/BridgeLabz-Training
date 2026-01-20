package com.bl.day8.theatershowlistings;

import java.time.LocalTime;

public class Movie {
	public String movieName;
	public LocalTime time;

	public Movie(String movieName, LocalTime time) {
		super();
		this.movieName = movieName;
		this.time = time;
	}

	@Override
	public String toString() {
		return movieName + " - " + time;
	}

}
