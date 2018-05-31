package edu.springinaction.chapter4.soundsystem;

/**
 * @author Patrick Frison
 * @version 1.0
 * Date: 30/05/2018
 * Time: 00:24
 **/
//@Component("sgtPeppers")
public class SgtPeppers implements CompactDisc {
    private String title = "Sgt. Pepper's Lonely Hearts Club Band";
    private String artist = "The Beatles";


    @Override
    public void playTrack(int trackNumber) {
        System.out.printf("Playing %s by %s. %d", title, artist, trackNumber);
    }
}
