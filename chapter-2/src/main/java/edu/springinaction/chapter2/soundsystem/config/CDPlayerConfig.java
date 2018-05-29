package edu.springinaction.chapter2.soundsystem.config;

import edu.springinaction.chapter2.soundsystem.CompactDisc;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * @author Patrick Frison
 * @version 1.0
 * Date: 30/05/2018
 * Time: 00:28
 **/
@Configuration
// will search base package based on classed given:
@ComponentScan(basePackageClasses = CompactDisc.class)
public class CDPlayerConfig {
}
