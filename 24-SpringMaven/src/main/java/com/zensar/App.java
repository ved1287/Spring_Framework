package com.zensar;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.zensar.config.MyConfig;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       AnnotationConfigApplicationContext context;
       context=new AnnotationConfigApplicationContext(MyConfig.class);
       System.out.println(context.getBean("f1"));
       System.out.println(context.getBean("Sbean"));
       System.out.println(context.getBean("ebean"));
       
    }
}
