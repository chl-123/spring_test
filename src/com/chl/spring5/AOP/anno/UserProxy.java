package com.chl.spring5.AOP.anno;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class UserProxy {
    //相同切入点的抽取
    @Pointcut(value = "execution(* com.chl.spring5.AOP.anno.User.add(..))")
    public void pointcutdemo(){

    }
    @Before(value = "pointcutdemo()")
    public void before(){
        System.out.println("before...");
    }
    @After(value = "execution(* com.chl.spring5.AOP.anno.User.add(..))")
    public void after(){
        System.out.println("after...");
    }
    @AfterReturning(value = "execution(* com.chl.spring5.AOP.anno.User.add(..))")
    public void afterReturning(){
        System.out.println("afterReturning...");

    }

    @AfterThrowing(value = "execution(* com.chl.spring5.AOP.anno.User.add(..))")
    public void afterThrowing() {
        System.out.println("afterThrowing...");
    }
    @Around(value = "execution(* com.chl.spring5.AOP.anno.User.add(..))")
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("before...");
        proceedingJoinPoint.proceed();
        System.out.println("after.....");
    }
}
