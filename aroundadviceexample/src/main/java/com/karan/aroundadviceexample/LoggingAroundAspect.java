package com.karan.aroundadviceexample;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAroundAspect {
	
	@Around("execution(* com.karan.aroundadviceexample.StudentManagerImpl.*(..))")
    public void logAroundAllMethods(ProceedingJoinPoint joinPoint) throws Throwable
    {
        System.out.println("com.karan.aroundadviceexample.LoggingAroundAspect.logAroundAllMethods() : " + joinPoint.getSignature().getName() + ": Before Method Execution");
        try {
            joinPoint.proceed();
        } finally {
            
        }
        System.out.println("com.karan.aroundadviceexample.LoggingAroundAspect.logAroundAllMethods() : " + joinPoint.getSignature().getName() + ": After Method Execution");
    }
 
    @Around("execution(* com.karan.aroundadviceexample.StudentManagerImpl.getStudentById(..))")
    public void logAroundGetEmployee(ProceedingJoinPoint joinPoint) throws Throwable
    {
        System.out.println("com.karan.aroundadviceexample.LoggingAroundAspect.logAroundGetStudent() : " + joinPoint.getSignature().getName() + ": Before Method Execution");
        try {
            joinPoint.proceed();
        } finally {
            
        }
        System.out.println("com.karan.aroundadviceexample.LoggingAroundAspect.logAroundGetStudent() : " + joinPoint.getSignature().getName() + ": After Method Execution");
    }
 
    @Around("execution(* com.karan.aroundadviceexample.StudentManagerImpl.createStudent(..))")
    public void logAroundCreateEmployee(ProceedingJoinPoint joinPoint) throws Throwable
    {
        System.out.println("com.karan.aroundadviceexample.LoggingAroundAspect.logAroundCreateStudent() : " + joinPoint.getSignature().getName() + ": Before Method Execution");
        try {
            joinPoint.proceed();
        } finally {
           
        }
        System.out.println("com.karan.aroundadviceexample.LoggingAroundAspect.logAroundCreateStudent() : " + joinPoint.getSignature().getName() + ": After Method Execution");
    }

}
