package com.example.SpringBootPracticeCodes;

import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.aspectj.lang.annotation.Aspect;

import org.springframework.stereotype.Component;

@EnableAspectJAutoProxy
//Part of AOP
//helps to handle Cross Cutting concerns Separately like Logging,transaction etc
//Need not write logs inside every method
@Aspect
@Component
public class LoggingAspect {

    private static final Logger logger = LoggerFactory.getLogger(LoggingAspect.class);

        @Before("execution(* com.example..*.getStockInfo(..))")
        public void logBeforeGetStockInfo() {
            logger.info("Someone just called getStockInfo method!");
        }
    }


