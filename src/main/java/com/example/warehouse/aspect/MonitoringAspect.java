package com.example.warehouse.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MonitoringAspect {
    Logger logger = LoggerFactory.getLogger(MonitoringAspect.class);

//    @Pointcut("execution(* com.example.warehouse.service.ProductService.*(..))")
    @Pointcut("@annotation(Monitoring)")
    public void pointcut(){}

//    @Before("pointcut()")
//    public void beforeExecution(){
//        System.out.println("before execution");
//    }
//
    @Around("pointcut()")
    public Object aroundLogic(ProceedingJoinPoint pjp) throws Throwable {
        logger.info("");
        return pjp.proceed();

    }


}
