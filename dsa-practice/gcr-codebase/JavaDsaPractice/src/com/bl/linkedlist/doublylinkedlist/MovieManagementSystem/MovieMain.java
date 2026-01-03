package com.bl.linkedlist.doublylinkedlist.MovieManagementSystem;

public class MovieMain {

	public static void main(String[] args) {
		MovieList movies = new MovieList();

		movies.addAtEnd("Inception", "Nolan", 2010, 9.0);
		movies.addAtBeginning("Interstellar", "Nolan", 2014, 8.8);
		movies.addAtPosition(2, "Avatar", "Cameron", 2009, 8.0);

		System.out.println("All Movies:");
		movies.displayForward();

		movies.searchByDirector("Nolan");
		movies.updateRating("Avatar", 8.5);

		System.out.println("Reverse Order:");
		movies.displayReverse();

		movies.removeByTitle("Inception");
		movies.displayForward();
	}
}
