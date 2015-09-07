/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed.cracken.code.infrastructure.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 *
 * @author edcracken
 */
@Aspect
@Order(1)
@Component
public class RestApiListener2 {

    @Pointcut("execution(* ed.cracken.code.web.*.*(..))")
    public void allMethods() {
    }

    @Before("allMethods()")
    public void showBeforeRestMethod() {
        System.out.println("loggin1");
    }

    @After("allMethods()")
    public void afterMethod() {
        System.out.println("loggin2");
    }
}
