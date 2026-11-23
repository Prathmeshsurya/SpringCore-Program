package com.Task1;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Student {
	 private int rollNo;
	 private String studentName;
	 private String course;
	 public int getRollNo() {
		 return rollNo;
	 }
	 public void setRollNo(int rollNo) {
		 this.rollNo = rollNo;
	 }
	 public String getStudentName() {
		 return studentName;
	 }
	 public void setStudentName(String studentName) {
		 this.studentName = studentName;
	 }
	 public String getCourse() {
		 return course;
	 }
	 public void setCourse(String course) {
		 this.course = course;
	 }
	 public void displayStudent() {
		 System.out.println(rollNo);
		 System.out.println(studentName);
		 System.out.println(course);
	 }
	 
	 public static void main(String[] args) {
		
		 ApplicationContext context =  new 
				 ClassPathXmlApplicationContext("com/Task1/application1-context.xml");
		 Student bean = context.getBean("Student",Student.class);
		 //System.out.println(bean);
		 bean.displayStudent();
	}
}
