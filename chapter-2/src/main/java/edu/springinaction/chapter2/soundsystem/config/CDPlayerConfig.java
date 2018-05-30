package edu.springinaction.chapter2.soundsystem.config;

import edu.springinaction.chapter2.soundsystem.CDPlayer;
import edu.springinaction.chapter2.soundsystem.CompactDisc;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * @author Patrick Frison
 * @version 1.0
 * Date: 30/05/2018
 * Time: 00:28
 **/
@Configuration
// will search base package based on classed given:
// now we have control over bean wiring:
// @ComponentScan(basePackageClasses = CompactDisc.class)
public class CDPlayerConfig {
    @Bean
    public CDPlayer cdPlayer(CompactDisc compactDisc) {
        CDPlayer cdPlayer = new CDPlayer();
        cdPlayer.insertDisc(compactDisc);
        return cdPlayer;
    }

    // of:
//    @Bean
//    public MediaPlayer anotherCDPlayer(CompactDisc disc){
//        return new CDPlayer(disc);
//    }

}
