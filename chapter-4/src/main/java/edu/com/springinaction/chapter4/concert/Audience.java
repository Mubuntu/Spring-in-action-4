package edu.com.springinaction.chapter4.concert;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * @author Patrick Frison
 * @version 1.0
 * Date: 31/05/2018
 * Time: 16:52
 **/
@Aspect
public class Audience  {
    @Before("execution (* edu.com.springinaction.chapter4.concert.Performance.perform(..))")
    public void silenceCellPhones(){
        System.out.println("Silencing cell phones");
    }

    @Before("execution(* edu.com.springinaction.chapter4.concert.Performance.perform(..))")
    public void takeSeats() {
        System.out.println("Taking seats");
    }
    @AfterReturning("execution(* edu.com.springinaction.chapter4.concert.Performance.perform(..))")
    public void applause() {
        System.out.println("CLAP CLAP CLAP!!!");
    }
    @AfterThrowing("execution(* edu.com.springinaction.chapter4.concert.Performance.perform(..))")
    public void demandRefund() {
        System.out.println("Demanding a refund");
    }
}
