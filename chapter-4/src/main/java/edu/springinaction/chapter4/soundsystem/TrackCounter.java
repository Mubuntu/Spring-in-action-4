package edu.springinaction.chapter4.soundsystem;

import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Patrick Frison
 * @version 1.0
 * Date: 31/05/2018
 * Time: 17:35
 **/
public class TrackCounter {
    private Map<Integer, Integer> trackCounts =
            new HashMap<Integer, Integer>();

    // advise the playTrack method
    @Pointcut(
            "execution(* edu.springinaction.chapter4.soundsystem.CompactDisc.playTrack(int)) " +
                    "&& args(trackNumber)")
    public void trackPlayed(int trackNumber) {

    }

    // Count a track before it’s played
    @Before("trackPlayed(trackNumber)")
    public void countTrack(int trackNumber) {
        int currentCount = getPlayCount(trackNumber);
        trackCounts.put(trackNumber, currentCount + 1);
    }

    public int getPlayCount(int trackNumber) {
        return trackCounts.getOrDefault(trackNumber, 0);
    }
}
