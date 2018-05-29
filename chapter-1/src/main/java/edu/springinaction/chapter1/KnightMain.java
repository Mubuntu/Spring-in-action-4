package edu.springinaction.chapter1;

import edu.springinaction.chapter1.knights.Knight;
import edu.springinaction.chapter1.knights.config.KnightConfig;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

@SpringBootApplication
public class KnightMain {

    public static void main(String[] args) {
        // Load Spring Context
        // FIXME: 29/05/2018 exception is org.springframework.beans.factory.NoSuchBeanDefinitionException: No bean named 'java.io.PrintStream@6ce139a4' available
       /*ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "META-INF/knights.xml"
        );*/
       // imo the best option
        ApplicationContext context = new AnnotationConfigApplicationContext(KnightConfig.class);
        // lees xml configuratie uit vanuit de filesystem:
/*
        ApplicationContext context = new FileSystemXmlApplicationContext("/Volumes/Storage/mubuntu/Github/Spring/Spring in action 4/knights.xml");
*/
        // get Knight bean
        Knight knight = context.getBean(Knight.class);
        // use knight
        knight.embarkOnQuest();
//        context.close();
    }

}
