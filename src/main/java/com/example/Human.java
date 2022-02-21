package com.example;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@Aspect
@EnableAspectJAutoProxy
public class Human {
    @Before("pointCuts()")
    public void wakeup(JoinPoint j){
        System.out.println("Good Morning !!");
        System.out.println("Name: "+j.getTarget().getClass().getName());
        System.out.println("Arguments Value: "+j.getArgs()[0]);
    }

    @AfterReturning(pointcut = "pointCuts()", returning = "val")
    public void sleep(int val) {
        System.out.println("Good Sleep !!");
        System.out.println("Returned Val-------" + val);
    }

    @AfterThrowing(pointcut = "execution(* doSomething(..))", throwing = "val")
    public void throwKer(MyException val) {
        System.out.println("Do Something !!");
        System.out.println("Custom Exp: " + val);
    }

    @Around("execution(int rankOfVideo(int, int))")
    public Object aroundTh(ProceedingJoinPoint jp) {
        Object[] objarg = jp.getArgs();
        objarg[0] = 0;
        objarg[1] = 1;
        Object res= null;
        try {
            res = jp.proceed(objarg);
        } catch (Throwable e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println(res);
        return 3000;
    }

    @Pointcut("execution(public * study(..))")
    public void pointCuts(){}
}
