package com.sabinghost19.aspect_practice.aspects;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Aspect
@Component
@Order(2)
public class SecurityAspect {
    private final Logger logger=Logger.getLogger(SecurityAspect.class.getName());


    @Around(value="@annotation(com.sabinghost19.aspect_practice.customAnnotations.ToLog)")
    public Object secure (ProceedingJoinPoint joinPoint) throws Throwable {
        logger.info("ASPECT SECURITY:Before");
        Object returnValue=joinPoint.proceed();
        logger.info("ASPECT SECURITY:After");
        return returnValue ;
    }
}
