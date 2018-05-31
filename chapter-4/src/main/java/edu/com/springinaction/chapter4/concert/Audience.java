package edu.com.springinaction.chapter4.concert;

import org.aspectj.lang.annotation.*;

/**
 * @author Patrick Frison
 * @version 1.0
 * Date: 31/05/2018
 * Time: 16:52
 **/
@Aspect
public class Audience  {
    // add named pointcut to reduce code duplication
    @Pointcut("execution (* edu.com.springinaction.chapter4.concert.Performance.perform(..))")
    public void performance(){

    }

    @Before("performance()")
    public void silenceCellPhones(){
        System.out.println("Silencing cell phones");
    }

    @Before("performance()")
    public void takeSeats() {
        System.out.println("Taking seats");
    }
    @AfterReturning("performance()")
    public void applause() {
        System.out.println("CLAP CLAP CLAP!!!");
    }
    @AfterThrowing("performance()")
    public void demandRefund() {
        System.out.println("Demanding a refund");
    }
}
