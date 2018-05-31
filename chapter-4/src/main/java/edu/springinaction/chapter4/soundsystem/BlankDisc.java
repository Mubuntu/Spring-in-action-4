package edu.springinaction.chapter4.soundsystem;

import java.util.List;

/**
 * @author Patrick Frison
 * @version 1.0
 * Date: 30/05/2018
 * Time: 21:17
 **/
public class BlankDisc implements CompactDisc {
    private String title;
    private String artist;
    private List<String> tracks;

    //
//    public BlankDisc(String title, String artist, List<String> tracks) {
//        this.title = title;
//        this.artist = artist;
//        this.tracks = tracks;
//    }
    // no longer obligated to wire properties -> create blank bean
    public void setTitle(String title) {
        this.title = title;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void setTracks(List<String> tracks) {
        this.tracks = tracks;
    }

    @Override
    public void playTrack(int trackNumber) {
        System.out.printf("Playing %s by %s", title, artist);
        for (String track : tracks) {
            System.out.println("-Track: " + trackNumber + track);
        }
    }
}
