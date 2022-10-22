package com.spring.proxy;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@Aspect
public class loggerAspect {
    @Pointcut("execution(* com.spring.proxy.CalculatorImpl.*(..))")
    public void pointCut(){}

    @Before("pointCut()")
    public void beforeAdvice(JoinPoint joinPoint){
        String name = joinPoint.getSignature().getName();
        String s = Arrays.toString(joinPoint.getArgs());
        System.out.println("前置通知-方法名"+name+"参数"+s);
    }
    @After("pointCut()")
    public void afterAdvice(){
        System.out.println("后置通知");
    }
    @AfterThrowing(value = "execution(* com.spring.proxy.CalculatorImpl.* (..))", throwing = "ex")
    public void afterThrowingMethod(JoinPoint joinPoint, Throwable ex){
        String methodName = joinPoint.getSignature().getName();
        System.out.println("Logger-->异常通知，方法名："+methodName+"，异常："+ex);
    }
    @Around("execution(* com.spring.proxy.CalculatorImpl.* (..))")
    public Object aroundMethod(ProceedingJoinPoint joinPoint){
        String methodName = joinPoint.getSignature().getName();
        String args = Arrays.toString(joinPoint.getArgs());
        Object result = null;
        try {
            System.out.println("环绕通知-->目标对象方法执行之前");
//目标方法的执行，目标方法的返回值一定要返回给外界调用者
            result = joinPoint.proceed();
            System.out.println("环绕通知-->目标对象方法返回值之后");
        } catch (Throwable throwable) {
            throwable.printStackTrace();
            System.out.println("环绕通知-->目标对象方法出现异常时");
        } finally {
            System.out.println("环绕通知-->目标对象方法执行完毕");
        }
        return result;
    }

}
