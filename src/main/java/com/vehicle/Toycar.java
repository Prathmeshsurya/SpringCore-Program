package com.vehicle;

public class Toycar {
 private int toyCarId;
 private String toyCarBrand;
 private Motor motor;
 
 
 public Toycar(int toyCarId, String toyCarBrand, Motor motor) {
	super();
	this.toyCarId = toyCarId;
	this.toyCarBrand = toyCarBrand;
	this.motor = motor;
}
 public int getToyCarId() {
	return toyCarId;
 }
 public void setToyCarId(int toyCarId) {
	this.toyCarId = toyCarId;
 }
 public String getToyCarBrand() {
	return toyCarBrand;
 }
 
 public Motor getMotor() {
	return motor;
}
 public void setMotor(Motor motor) {
	this.motor = motor;
 }
 public void setToyCarBrand(String toyCarBrand) {
	this.toyCarBrand = toyCarBrand;
 }
 public void displayDetails() {
	 System.out.println("The ToyCar Id Is :"+toyCarId);
	 System.out.println("The ToyCar Brand Is :"+toyCarBrand);
	 System.out.println("The Motor Details:");
	 motor.displayMotorDetails();
	 
 }

 
 
}
