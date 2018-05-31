package edu.springinaction.chapter4.soundsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author Patrick Frison
 * @version 1.0
 * Date: 30/05/2018
 * Time: 16:35
 **/
@Component
public class CDPlayer implements MediaPlayer {
    private CompactDisc cd;

    // alleen default constructor - cd is not a hard depedency - no constructor injection
//    @Autowired
//    public CDPlayer(CompactDisc cd) {
//        this.cd = cd;
//    }
    // optional dependency - property injection
    @Autowired
    public void insertDisc(CompactDisc cd) {
        this.cd = cd;

    }

    @Override
    public void play() {

    }

//    @Autowired
//    public void setCompactDisc(CompactDisc cd) {
//        this.cd = cd;
//    }

//    @Override
//    public void play() {
//        cd.playTrack();
//    }
}
