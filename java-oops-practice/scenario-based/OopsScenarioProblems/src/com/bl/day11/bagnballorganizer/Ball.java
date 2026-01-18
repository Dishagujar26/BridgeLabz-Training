package com.bl.day11.bagnballorganizer;

public class Ball {
	private String id;
	private String color;
	private String size;

	public Ball(String id, String color, String size) {
		this.id = id;
		this.color = color;
		this.size = size;
	}

	@Override
	public String toString() {
		return id + " (" + color + ", " + size + ")";
	}
}
