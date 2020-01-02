package com.abc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
       HelloWolrd helloWorld=(HelloWolrd)context.getBean("helloworld");
       helloWorld.greet();
    }
}
