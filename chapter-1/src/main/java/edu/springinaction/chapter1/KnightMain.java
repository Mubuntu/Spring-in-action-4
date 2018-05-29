package edu.springinaction.chapter1;

import edu.springinaction.chapter1.knights.Knight;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class KnightMain {

    public static void main(String[] args) {
        // Load Spring Context
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "META-INF/knights.xml"
        );
        // get Knight bean
        Knight knight = context.getBean(Knight.class);
        // use knight
        knight.embarkOnQuest();
        context.close();
    }
}
