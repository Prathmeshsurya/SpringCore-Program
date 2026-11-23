package com.AutoWire;

import java.util.Map;

public class Resume {
  private String  designation;
  private Map<String,Integer> passoutYear;
  public String getDesignation() {
	return designation;
  }
  public void setDesignation(String designation) {
	this.designation = designation;
  }
  public Map<String, Integer> getPassoutYear() {
	return passoutYear;
  }
  public void setPassoutYear(Map<String, Integer> passoutYear) {
	this.passoutYear = passoutYear;
  }
  @Override
  public String toString() {
	return "Resume [designation=" + designation + ", passoutYear=" + passoutYear + "]";
  }
  
  
  
}
