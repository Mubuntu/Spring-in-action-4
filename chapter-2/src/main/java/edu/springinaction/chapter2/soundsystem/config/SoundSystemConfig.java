package edu.springinaction.chapter2.soundsystem.config;

import edu.springinaction.chapter2.soundsystem.CompactDisc;
import org.springframework.context.annotation.Import;

/**
 * @author Patrick Frison
 * @version 1.0
 * Date: 30/05/2018
 * Time: 21:32
 **/
@Import({CompactDiscConfig.class, CDPlayerConfig.class})
public class SoundSystemConfig {
}
