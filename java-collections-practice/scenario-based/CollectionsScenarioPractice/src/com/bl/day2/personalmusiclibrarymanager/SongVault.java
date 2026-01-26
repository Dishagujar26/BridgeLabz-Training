package com.bl.day2.personalmusiclibrarymanager;
import java.io.*;
import java.util.*;
import java.util.regex.*;
import java.util.stream.Collectors;

public class SongVault<T extends Media> {

    private static final Pattern TITLE = Pattern.compile("Title: (.+)");
    private static final Pattern ARTIST = Pattern.compile("Artist: (.+)");
    private static final Pattern DURATION = Pattern.compile("Duration: (.+)");
    private static final Pattern GENRE = Pattern.compile("Genre: (.+)");

    private List<T> mediaList = new ArrayList<>();
    private Map<String, List<T>> genreMap = new HashMap<>();
    private Set<String> uniqueArtists = new HashSet<>();

    @SuppressWarnings("unchecked")
    public void loadSong(File file) throws IOException {
        String title = "", artist = "", duration = "", genre = "";

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (TITLE.matcher(line).matches()) title = line.split(": ")[1];
                if (ARTIST.matcher(line).matches()) artist = line.split(": ")[1];
                if (DURATION.matcher(line).matches()) duration = line.split(": ")[1];
                if (GENRE.matcher(line).matches()) genre = line.split(": ")[1];
            }
        }

        Song song = new Song(title, artist, duration, genre);
        mediaList.add((T) song);

        genreMap.computeIfAbsent(genre, k -> new ArrayList<>()).add((T) song);
        uniqueArtists.add(artist);
    }

    public List<T> getAllMedia() {
        return mediaList;
    }

    public Map<String, List<T>> getSongsByGenre() {
        return genreMap;
    }

    public Set<String> getUniqueArtists() {
        return uniqueArtists;
    }

    // Stream filtering
    public List<T> filterByArtist(String artist) {
        return mediaList.stream()
                .filter(m -> m.getArtist().equalsIgnoreCase(artist))
                .collect(Collectors.toList());
    }

    public List<T> sortByTitle() {
        return mediaList.stream()
                .sorted(Comparator.comparing(Media::getTitle))
                .collect(Collectors.toList());
    }
}
