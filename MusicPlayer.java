import java.util.Scanner;

// Song class to represent individual songs
class Song {
    private String title;
    private String artist;
    private int duration; // Duration in seconds

    public Song(String title, String artist, int duration) {
        this.title = title;
        this.artist = artist;
        this.duration = duration;
    }

    // Getters for song attributes
    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public int getDuration() {
        return duration;
    }
}

// Playlist class to represent a collection of songs
class Playlist {
    private String name;
    private Song[] songs; // Array to store songs
    private int songCount; // Counter for number of songs in the playlist
    private static final int MAX_SONGS = 100; // Maximum number of songs allowed in the playlist

    public Playlist(String name) {
        this.name = name;
        this.songs = new Song[MAX_SONGS];
        this.songCount = 0;
    }

    // Method to add a song to the playlist
    public void addSong(Song song) {
        if (songCount < MAX_SONGS) {
            songs[songCount] = song;
            songCount++;
        } else {
            System.out.println("Cannot add more songs. Playlist is full.");
        }
    }

    // Method to remove a song from the playlist
    public void removeSong(String title) {
        for (int i = 0; i < songCount; i++) {
            if (songs[i].getTitle().equals(title)) {
                for (int j = i; j < songCount - 1; j++) {
                    songs[j] = songs[j + 1];
                }
                songCount--;
                return;
            }
        }
        System.out.println("Song not found in the playlist.");
    }

    // Method to get the total duration of all songs in the playlist
    public int getTotalDuration() {
        int totalDuration = 0;
        for (int i = 0; i < songCount; i++) {
            totalDuration += songs[i].getDuration();
        }
        return totalDuration;
    }

    // Getter for playlist name
    public String getName() {
        return name;
    }
}

// Main class to demonstrate the usage
public class MusicPlayer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask for playlist name
        System.out.print("Enter playlist name: ");
        String playlistName = scanner.nextLine();
        Playlist playlist = new Playlist(playlistName);

        // Ask for songs and add them to the playlist
        while (true) {
            System.out.print("Enter song title (or type 'done' to finish): ");
            String title = scanner.nextLine();
            if (title.equalsIgnoreCase("done")) {
                break;
            }
            System.out.print("Enter artist name: ");
            String artist = scanner.nextLine();
            System.out.print("Enter duration (in seconds): ");
            int duration = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            Song song = new Song(title, artist, duration);
            playlist.addSong(song);
        }

        scanner.close();

        // Print playlist information
        System.out.println("\nPlaylist: " + playlist.getName());
        System.out.println("Total Duration: " + playlist.getTotalDuration() + " seconds");
    }
}
