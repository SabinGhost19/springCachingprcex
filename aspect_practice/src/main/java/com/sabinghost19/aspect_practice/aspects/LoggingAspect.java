package com.sabinghost19.aspect_practice.aspects;

import com.sabinghost19.aspect_practice.services.CommentService;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.springframework.stereotype.Component;
import org.aspectj.lang.annotation.Aspect;

import java.util.Arrays;
import java.util.logging.Logger;

@Component
@Aspect
public class LoggingAspect {

    private final Logger logger= Logger.getLogger(CommentService.class.getName());

    @Around("execution(* com.sabinghost19.aspect_practice.services.*.*(..))")
    public void log(ProceedingJoinPoint joinPoint) throws Throwable {
        logger.info("ASPECT:Before the method");
        String methodName = joinPoint.getSignature().getName();
        Object[] args = joinPoint.getArgs();

        logger.info("Method " + methodName +
                " with parameters " + Arrays.asList(args) +
                " will execute");
        Object returnValue = joinPoint.proceed(args);
        //  Delegates to the actual intercepted method
        logger.info("ASPECT:After the method with returnValue " + returnValue);
    }
}
