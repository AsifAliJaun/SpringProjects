package com.example.Spring2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import sp.Student;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext ac=new ClassPathXmlApplicationContext("bean.xml");
        Student s=(Student)ac.getBean("studentbean");
        s.displayInfo();
    }
}
