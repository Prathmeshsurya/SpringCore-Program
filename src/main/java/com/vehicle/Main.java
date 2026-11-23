package com.vehicle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
 public static void main(String[] args) {
	
	 ApplicationContext context = new 
			 ClassPathXmlApplicationContext("com/vehicle/application-context.xml");
	    Toycar bean = context.getBean("toycar",Toycar.class);
	    //System.out.println(bean);
	    bean.displayDetails();
	    
  }
}
