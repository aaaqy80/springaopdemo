package com;

import com.sun.java_cup.internal.runtime.virtual_parse_stack;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @className:LogServiceImpl
 * @discription:
 * @author:zz
 * @crateTime:2018-11-07 22:54
 */
@Component
@Aspect
public class LogServiceImpl {
    @Pointcut(value = "execution(void *())")
    public void p1(){};
    @AfterReturning(value = "p1()")
    public void saveLog(){
        System.out.println("记录日志");
    }
}
