package edu.springinaction.chapter1.knights;

import edu.springinaction.chapter1.quests.RescueDamselQuest;

/**
 * @author Patrick Frison
 * @version 1.0
 * Date: 29/05/2018
 * Time: 01:44
 **/
public class DamselRescuingKnight implements Knight {
    private RescueDamselQuest quest;

    public DamselRescuingKnight() {
        // tightly coupled!  FIXME: 29/05/2018 verander dit naar loosely coupled versie
        this.quest = new RescueDamselQuest();
    }

    @Override
    public void embarkOnQuest() {
        quest.embark();
    }
}
