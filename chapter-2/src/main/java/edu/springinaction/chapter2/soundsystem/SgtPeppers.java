package edu.springinaction.chapter2.soundsystem;

import org.springframework.stereotype.Component;

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
    public void play() {
        System.out.printf("Playing %s by %s.", title, artist);
    }
}
