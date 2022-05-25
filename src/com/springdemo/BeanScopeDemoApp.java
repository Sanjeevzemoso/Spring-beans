package com.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {
    public static void main(String[] args) {

        //load spring config file
        ClassPathXmlApplicationContext context = new
                ClassPathXmlApplicationContext("beanScope-applicationContext.xml");

        //retireve bean from spring
        Coach theCoach = context.getBean("myCoach",Coach.class);

        Coach aplhaCoach = context.getBean("myCoach",Coach.class);

        boolean result  = (theCoach == aplhaCoach);
        System.out.println("\nPointing to the same object "+result);
        System.out.println(theCoach);
        System.out.println(aplhaCoach);
        context.close();
    }
}
