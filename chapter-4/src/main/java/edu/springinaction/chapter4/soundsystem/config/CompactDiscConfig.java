package edu.springinaction.chapter4.soundsystem.config;

import edu.springinaction.chapter4.soundsystem.CompactDisc;
import edu.springinaction.chapter4.soundsystem.SgtPeppers;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Patrick Frison
 * @version 1.0
 * Date: 30/05/2018
 * Time: 21:32
 **/
@Configuration
public class CompactDiscConfig {
    @Bean
    public CompactDisc compactDisc() {
        return new SgtPeppers();
    }
}
