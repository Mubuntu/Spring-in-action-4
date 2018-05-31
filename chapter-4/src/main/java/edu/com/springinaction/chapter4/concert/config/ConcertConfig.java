package edu.com.springinaction.chapter4.concert.config;

import edu.com.springinaction.chapter4.concert.Audience;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author Patrick Frison
 * @version 1.0
 * Date: 31/05/2018
 * Time: 17:14
 **/
@Configuration
@EnableAspectJAutoProxy
@ComponentScan(basePackageClasses = {Audience.class})
public class ConcertConfig {

    @Bean
    public Audience audience(){
        return new Audience();
    }
}
