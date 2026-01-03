package com.bl.linkedlist.doublylinkedlist.MovieManagementSystem;

public class MovieList {
	private MovieNode head;
	private MovieNode tail;

	// Add at beginning
	public void addAtBeginning(String title, String director, int year, double rating) {
		MovieNode node = new MovieNode(title, director, year, rating);
		if (head == null) {
			head = tail = node;
			return;
		}
		node.next = head;
		head.prev = node;
		head = node;
	}

	// Add at end
	public void addAtEnd(String title, String director, int year, double rating) {
		MovieNode node = new MovieNode(title, director, year, rating);
		if (tail == null) {
			head = tail = node;
			return;
		}
		tail.next = node;
		node.prev = tail;
		tail = node;
	}

	// Add at specific position (1-based)
	public void addAtPosition(int pos, String title, String director, int year, double rating) {
		if (pos == 1) {
			addAtBeginning(title, director, year, rating);
			return;
		}

		MovieNode temp = head;
		for (int i = 1; i < pos - 1 && temp != null; i++)
			temp = temp.next;

		if (temp == null) {
			System.out.println("Invalid position");
			return;
		}

		MovieNode node = new MovieNode(title, director, year, rating);
		node.next = temp.next;
		node.prev = temp;

		if (temp.next != null)
			temp.next.prev = node;
		else
			tail = node;

		temp.next = node;
	}

	// Remove movie by title
	public void removeByTitle(String title) {
		MovieNode temp = head;
		while (temp != null && !temp.title.equalsIgnoreCase(title))
			temp = temp.next;

		if (temp == null) {
			System.out.println("Movie not found");
			return;
		}

		if (temp.prev != null)
			temp.prev.next = temp.next;
		else
			head = temp.next;

		if (temp.next != null)
			temp.next.prev = temp.prev;
		else
			tail = temp.prev;
	}

	// Search by director
	public void searchByDirector(String director) {
		MovieNode temp = head;
		boolean found = false;
		while (temp != null) {
			if (temp.director.equalsIgnoreCase(director)) {
				displayMovie(temp);
				found = true;
			}
			temp = temp.next;
		}
		if (!found)
			System.out.println("No movies found for director");
	}

	// Search by rating
	public void searchByRating(double rating) {
		MovieNode temp = head;
		boolean found = false;
		while (temp != null) {
			if (temp.rating == rating) {
				displayMovie(temp);
				found = true;
			}
			temp = temp.next;
		}
		if (!found)
			System.out.println("No movies found with this rating");
	}

	// Update rating by title
	public void updateRating(String title, double newRating) {
		MovieNode temp = head;
		while (temp != null) {
			if (temp.title.equalsIgnoreCase(title)) {
				temp.rating = newRating;
				System.out.println("Rating updated");
				return;
			}
			temp = temp.next;
		}
		System.out.println("Movie not found");
	}

	// Display forward
	public void displayForward() {
		MovieNode temp = head;
		while (temp != null) {
			displayMovie(temp);
			temp = temp.next;
		}
	}

	// Display reverse
	public void displayReverse() {
		MovieNode temp = tail;
		while (temp != null) {
			displayMovie(temp);
			temp = temp.prev;
		}
	}

	private void displayMovie(MovieNode m) {
		System.out.println(m.title + " | " + m.director + " | " + m.year + " | Rating: " + m.rating);
	}
}
