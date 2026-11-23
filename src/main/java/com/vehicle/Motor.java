package com.vehicle;

public class Motor {
 
	private int motorId;
	private String motorType;
	
	
	public Motor(int motorId, String motorType) {
		super();
		this.motorId = motorId;
		this.motorType = motorType;
	}
	public int getMotorId() {
		return motorId;
	}
	public void setMotorId(int motorId) {
		this.motorId = motorId;
	}
	public String getMotorType() {
		return motorType;
	}
	public void setMotorType(String motorType) {
		this.motorType = motorType;
	}
	public void displayMotorDetails() {
		System.out.println("The Motor Id is :"+motorId);
		System.out.println("The Motor Type Is :"+motorType);
	
	}
}
