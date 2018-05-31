package edu.springinaction.chapter4.concert;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

/**
 * @author Patrick Frison
 * @version 1.0
 * Date: 31/05/2018
 * Time: 16:52
 **/
@Aspect
public class Audience  {
    // add named pointcut to reduce code duplication
    @Pointcut("execution (* edu.springinaction.chapter4.concert.Performance.perform(..))")
    public void performance(){

    }
    // lets write an advice that does the before and after advice in single swoop:

    @Around("performance()")
    public void watchPerformance(ProceedingJoinPoint jp){
        try{
            System.out.println("Silencing cell phones");
            System.out.println("Taking seats");
            jp.proceed();
            System.out.println("CLAP CLAP CLAP!!!");

        }catch (Throwable e){
            System.out.println("Demanding a refund");
        }
    }

}
