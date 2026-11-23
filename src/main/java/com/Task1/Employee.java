package com.Task1;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Employee {
	 private int employeeId;
	 private String employeeName;
	 private float employeeSalary;
	 
	 public Employee(int employeeId, String employeeName, float employeeSalary) {

		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
	}
	 public void displayEmployee() {
	  System.out.println(employeeId);
	  System.out.println(employeeName);
	  System.out.println(employeeSalary);
	 }

	 public static void main(String[] args) {
		
		 ApplicationContext context = new 
				 ClassPathXmlApplicationContext("com/Task1/application-context.xml");
		 Employee bean = context.getBean("Employee",Employee.class);
		 //System.out.println(bean);
		 bean.displayEmployee();
		
	}
}
