package edu.springinaction.chapter1;

import edu.springinaction.chapter1.knights.BraveKnight;
import edu.springinaction.chapter1.quests.Quest;
import org.junit.Test;

import static org.mockito.Mockito.*;

/**
 * @author Patrick Frison        BraveKnight knight = new BraveKnight(mock())

 * @version 1.0
 * Date: 29/05/2018
 * Time: 01:55
 **/
public class BraveKnightTests {
    @Test
    public void knightShouldEmbarkOnQuest() {
        Quest mockQuest = mock(Quest.class); // create mockQuest
        BraveKnight knight = new BraveKnight(mockQuest); // inject Mock Quest
        knight.embarkOnQuest();
        verify(mockQuest, times(1)).embark();
    }
}
