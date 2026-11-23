package com.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	 public static void main(String[] args) {
		ApplicationContext context = new
				ClassPathXmlApplicationContext("com/service/application-context.xml");
		
		  NotificationService bean =context.getBean("service",NotificationService.class);
		  System.out.println(bean);
		  
		  System.out.println("-----------------------------");
		  System.out.println("\u001B[31m"+"Services Are:");
		  bean.getNotificationServiceType()
		  .stream()
		  .forEach(System.out::println);
		  
		  System.out.println("-----------------------------");
		  System.out.println("\u001B[32m"+"Regions Are:");
		  bean.getServiceRegions()
		  .stream()
		  .forEach(System.out::println);
		  
		  System.out.println("------------------------------");
		  System.out.println("\u001B[33m"+"Regions Are:");
		  bean.getNotificationProvider()
		  .forEach((key,value)->
		              System.out.println(key+"--------"+value));
		  
		  System.out.println("------------------------------");
		  System.out.println("\u001B[34m"+"Properties Are:");
		  bean.getBasicConfProperties()
		  .forEach((key,value) ->
		  System.out.println(key+"-------"+value));
		  System.out.println("------------------------------"+"\u001B[0m");
		  
		  /*  java 8 
		   *   check wheather Whatsapp Service Is Present or Not 
		   *  */ 
		  System.out.println(bean.getNotificationServiceType());
		  boolean anyMatch = bean.getNotificationServiceType()
				  .stream()
				  .anyMatch(e -> e.equalsIgnoreCase("Whatsapp"));
		  
		  System.out.println(anyMatch);
		  if(anyMatch) {
			  System.out.println("WhatsApp Service Is Present");	
		  }else {
			  System.out.println("NOt Present");
		  }
//		  boolean anymatch = bean.getBasicConfProperties()
//				  .stringPropertyNames() 
//				  .stream() 
//				  .anyMatch(e -> e.equalsIgnoreCase("Whatsapp")); 
//		  if (anymatch){
//			  System.out.println("Whatsapp Service Is Present");
//		 
//		  }else {
//			  System.out.println("Whatsapp Service Is Not Present");
//			  }
	}
}
