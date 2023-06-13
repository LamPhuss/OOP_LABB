package hust.soict.cybersec.aims.Media;

import java.util.*;

public class CompactDisc extends Disc implements Playable {
    private String artist;

    public String getArtist() {
        return artist;
    }

    private ArrayList<Track> tracks = new ArrayList<>();

    public ArrayList<Track> getTracks() {
        return tracks;
    }

    public CompactDisc(String title, String category, String director, int length, float cost, String artist) {
        super(title, category, director, length, cost);
        this.artist = artist;
    }

    public void addTrack(Track track) {
        if (tracks.contains(track)) {
            System.out.println(track + "is already in the list of tracks");
            return;
        } else {
            tracks.add(track);
            System.out.println(track + "has been added to the list of tracks");
            return;
        }
    }

    public void removeTrack(Track track) {
        if (tracks.contains(track)) {
            tracks.remove(track);
            System.out.println(track + "has been removed from the list of tracks");
            return;
        } else {
            System.out.println(track + "is not in the list of tracks");
            return;
        }
    }

    public void play() {
        System.out.println("Playing CD: ");
        for (Track track : tracks) {
            track.play();
        }
    }

    @Override
    public String toString() {
        return "CD" + " - " + title + " - " + category + " - "
                + director
                + " - "
                + length + " - " + artist + ": " + cost + "$";
    }
}
