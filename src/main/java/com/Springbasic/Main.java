package com.Springbasic;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
  public static void main(String[] args) {
	
	   ApplicationContext context = new AnnotationConfigApplicationContext(ChipConfig.class);
	   
	  Chip bean = context.getBean("chip",Chip.class);
	  System.out.println(bean);
	  
	 Robot robot = context.getBean("My-Robo",Robot.class);
	  robot.makeActivate();
}
}
