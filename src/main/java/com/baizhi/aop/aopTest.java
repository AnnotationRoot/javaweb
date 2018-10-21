package com.baizhi.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.Configuration;

/**
 * Created by hello world on 2018/10/21.
 */
@Configuration
@Aspect
public class aopTest {
    @Pointcut(value = "execution(* com.baizhi.service.*.*(..))")
    public void aa() {
    }

    @Before(value = "aa()")
    public void testBefore() {
        System.out.println("+++++++++++before++++++++++++");
    }
}
