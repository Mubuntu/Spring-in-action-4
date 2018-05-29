package edu.springinaction.chapter1;

import edu.springinaction.chapter1.knights.Knight;
import edu.springinaction.chapter1.knights.config.KnightConfig;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class KnightMain {

    public static void main(String[] args) {
        // Load Spring Context
       /* ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "META-INF/knights.xml"
        );*/
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(KnightConfig.class);
        // get Knight bean
        Knight knight = context.getBean(Knight.class);
        // use knight
        knight.embarkOnQuest();
        context.close();
    }
}
