package com.bl.day9.mobilegamedistributionplatform;

import java.util.*;

public class User {
	private String name;
	private List<Game> ownedGames; // Encapsulated

	public User(String name) {
		this.name = name;
		ownedGames = new ArrayList<>();
	}

	public void buyGame(Game g) {
		ownedGames.add(g);
		System.out.println(g.title + " added to your library.");
	}

	public void showLibrary() {
		System.out.println("----- " + name + "'s Game Library -----");
		for (Game g : ownedGames) {
			System.out.println(g.title + " (" + g.genre + ")");
		}
	}
}
