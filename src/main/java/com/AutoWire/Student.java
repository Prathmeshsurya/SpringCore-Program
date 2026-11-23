package com.AutoWire;

public class Student {
 
	 private String name;
	 private int id;
	 private String address;
	 private float marks;
	 private qualification qualification;
	 private Resume Resume;
	 
	 
	 
	 
	 public Student(Resume resume) {
		this.Resume = resume;
	}
	 
	 public Student(qualification qualification, Resume resume) {
		super();
		this.qualification = qualification;
		this.Resume = resume;
	}

	 public String getName() {
		 return name;
	 }
	 public void setName(String name) {
		 this.name = name;
	 }
	 public int getId() {
		 return id;
	 }
	 public void setId(int id) {
		 this.id = id;
	 }
	 public String getAddress() {
		 return address;
	 }
	 public void setAddress(String address) {
		 this.address = address;
	 }
	 public float getMarks() {
		 return marks;
	 }
	 public void setMarks(float marks) {
		 this.marks = marks;
	 }
	 
	 public qualification getqualification() {
		return qualification;
	}
	 public void setqualification(qualification qualification) {
		 this.qualification = qualification;
	 }
	 
	 
	 public Resume getResume() {
		return Resume;
	}
	 public void setResume(Resume resume) {
		 Resume = resume;
	 }
	 @Override
	 public String toString() {
		return "Student [name=" + name + ", id=" + id + ", address=" + address + ", marks=" + marks + ", qualification="
				+ qualification + ", Resume=" + Resume + "]";
	 }
	 
	
	   
	  
}
