package com.bl.day2.personalmusiclibrarymanager;

import java.io.File;

/*
 8. SongVault – Personal Music Library Manager
Story: Nina is a music enthusiast who collects .txt files, each representing a song in the
format:
Title: Bohemian Rhapsody
Artist: Queen
Duration: 5:55
Genre: Rock
With hundreds of such files, she wants to create SongVault, a desktop app that:
● Reads song files using I/O Streams
● Extracts fields using Regex
● Stores songs in a List<Song> and groups them by genre using Map<String,
List<Song>>
● Uses Set<String> to list unique artists
● Allows filtering and sorting using Java Streams
● Supports Generics for different types of media: audio, video, podcast
*/
public class Main {
	public static void main(String[] args) throws Exception {

		SongVault<Song> vault = new SongVault<>();

		vault.loadSong(new File("D:\\scenariospecifidir\\bohemian.txt"));
		vault.loadSong(new File("D:\\scenariospecifidir\\imagine.txt"));

		System.out.println("All Songs:");
		vault.getAllMedia().forEach(System.out::println);

		System.out.println("\nGrouped by Genre:");
		vault.getSongsByGenre().forEach((g, s) -> System.out.println(g + " -> " + s));

		System.out.println("\nUnique Artists:");
		vault.getUniqueArtists().forEach(System.out::println);

		System.out.println("\nSongs by Queen:");
		vault.filterByArtist("Queen").forEach(System.out::println);

		System.out.println("\nSorted by Title:");
		vault.sortByTitle().forEach(System.out::println);
	}
}
