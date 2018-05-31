package edu.springinaction.chapter4.soundsystem.config;

import edu.springinaction.chapter4.soundsystem.BlankDisc;
import edu.springinaction.chapter4.soundsystem.CompactDisc;
import edu.springinaction.chapter4.soundsystem.TrackCounter;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Patrick Frison
 * @version 1.0
 * Date: 31/05/2018
 * Time: 18:08
 **/
public class TrackCounterConfig {
    @Bean
    public CompactDisc sgtPeppers() {
        BlankDisc cd = new BlankDisc();
        cd.setTitle("Sgt. Pepper's Lonely Hearts Club Band");
        cd.setArtist("The Beatles");
        List<String> tracks = new ArrayList<String>();
        tracks.add("Sgt. Pepper's Lonely Hearts Club Band");
        tracks.add("With a Little Help from My Friends");
        tracks.add("Lucy in the Sky with Diamonds");
        tracks.add("Getting Better");
        tracks.add("Fixing a Hole");
        // ...other tracks omitted for brevity...
        cd.setTracks(tracks);
        return cd;
    }

    @Bean
    public TrackCounter trackCounter() {
        return new TrackCounter();
    }
}
