package edu.springinaction.chapter1.quests;

import org.springframework.beans.factory.annotation.Autowired;

import java.io.PrintStream;

/**
 * @author Patrick Frison
 * @version 1.0
 * Date: 29/05/2018
 * Time: 02:20
 **/
public class SlayDragonQuest implements Quest {
    private PrintStream stream;

    // TODO: 29/05/2018 inject printStream into BraveKnight
    public SlayDragonQuest(PrintStream stream) {
        this.stream = stream;
    }

    @Override
    public void embark() {
        stream.println("Embarking on quest to slay the dragon!");
    }
}
