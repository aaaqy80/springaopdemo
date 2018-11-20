package com;

import com.DeptServerImpl;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("springaop-config.xml");
        DeptServerImpl ds = (DeptServerImpl) classPathXmlApplicationContext.getBean("ds");
        ds.add();
    }

}
