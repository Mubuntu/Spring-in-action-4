package edu.springinaction.chapter1.knights;

import java.io.PrintStream;

/**
 * @author Patrick Frison
 * @version 1.0
 * Date: 29/05/2018
 * Time: 11:09
 * a musically inclined logging system from medieval times
 **/
public class Minstrel {
    private PrintStream stream;

    public Minstrel(PrintStream stream) {
        this.stream = stream;
    }
    public void singBefore(){
        // called before quest
        stream.println("Fa fa fa, the knight is so brave!");
    }
    public void singAfter(){
        // called after the quest
        stream.println("Tee tee tee, the brave knight did embark on a quest!");
    }
}
