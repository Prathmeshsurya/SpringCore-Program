package com.AutoWire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
public static void main(String[] args) {
	 
	ApplicationContext context = new 
			ClassPathXmlApplicationContext("com/AutoWire/application-context.xml");
	     Student bean =context.getBean("student",Student.class);
	     System.out.println(bean);
}
}
