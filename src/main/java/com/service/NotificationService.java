package com.service;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class NotificationService {

	  private List<String> notificationServiceType;
	  private Set<String> serviceRegions;
	  private Map<String,String> notificationProvider;
	  private Properties basicConfProperties;
	  public List<String> getNotificationServiceType() {
		  return notificationServiceType;
	  }
	  public void setNotificationServiceType(List<String> notificationServiceType) {
		  this.notificationServiceType = notificationServiceType;
	  }
	  public Set<String> getServiceRegions() {
		  return serviceRegions;
	  }
	  public void setServiceRegions(Set<String> serviceRegions) {
		  this.serviceRegions = serviceRegions;
	  }
	  public Map<String, String> getNotificationProvider() {
		  return notificationProvider;
	  }
	  public void setNotificationProvider(Map<String, String> notificationProvider) {
		  this.notificationProvider = notificationProvider;
	  }
	  public Properties getBasicConfProperties() {
		  return basicConfProperties;
	  }
	  public void setBasicConfProperties(Properties basicConfProperties) {
		  this.basicConfProperties = basicConfProperties;
	  }
	  @Override
	  public String toString() {
		return "NotificationService [notificationServiceType=" + notificationServiceType + " serviceRegions="
				+ serviceRegions + ", notificationProvider=" + notificationProvider + ", basicConfProperties="
				+ basicConfProperties + "]";
	  }
	  
	  
	  
}
