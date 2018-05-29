package edu.springinaction.chapter1.quests;

/**
 * @author Patrick Frison
 * @version 1.0
 * Date: 29/05/2018
 * Time: 01:45
 **/
public class RescueDamselQuest implements Quest {


    @Override
    public void embark() {
        System.out.println("attempting to rescue Damsel on quest");
    }
}
