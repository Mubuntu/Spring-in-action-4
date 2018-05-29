package edu.springinaction.chapter1.knights.config;

import edu.springinaction.chapter1.knights.BraveKnight;
import edu.springinaction.chapter1.knights.Knight;
import edu.springinaction.chapter1.quests.Quest;
import edu.springinaction.chapter1.quests.SlayDragonQuest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Patrick Frison
 * @version 1.0
 * Date: 29/05/2018
 * Time: 02:33
 * java based configuration as alternative to XML
 **/
@Configuration
public class KnightConfig {
    @Bean
    public Knight knight() {
        return new BraveKnight(quest());
    }

    @Bean
    public Quest quest() {
        return new SlayDragonQuest(System.out);
    }
}
