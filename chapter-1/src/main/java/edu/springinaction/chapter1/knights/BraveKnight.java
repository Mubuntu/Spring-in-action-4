package edu.springinaction.chapter1.knights;

import edu.springinaction.chapter1.quests.Quest;

/**
 * @author Patrick Frison
 * @version 1.0
 * Date: 29/05/2018
 * Time: 01:50
 **/
public class BraveKnight implements Knight {
    // niet gekoppeld aan een specifieke implementatie van Quest maar de interface zelf
    private Quest quest;

    public BraveKnight(Quest quest) {
        this.quest = quest;
    }

    @Override
    public void embarkOnQuest() {
        quest.embark();
    }
}
