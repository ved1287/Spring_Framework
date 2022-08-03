package com.zensar;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext applicationContext;
        applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
       // String cmp=(String) applicationContext.getBean("company");
       // Integer s=(Integer)applicationContext.getBean("Integer");
        System.out.println(applicationContext.getBean("employee"));
        System.out.println(applicationContext.getBean("student"));
       
    }
}
