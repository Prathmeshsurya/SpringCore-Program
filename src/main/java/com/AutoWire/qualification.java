package com.AutoWire;

import java.util.List;

public class qualification {
 
	private String stream;
	private List<String> subject;
	private boolean intermediate;
	
	static {
		System.out.println("Class loading");
		}
		public qualification() {
		}
	
	public String getStream() {
		return stream;
	}
	public void setStream(String stream) {
		this.stream = stream;
	}
	public List<String> getSubject() {
		return subject;
	}
	public void setSubject(List<String> subject) {
		this.subject = subject;
	}
	public boolean isIntermediate() {
		return intermediate;
	}
	public void setIntermediate(boolean intermediate) {
		this.intermediate = intermediate;
	}
	@Override
	public String toString() {
		return "qualification [stream=" + stream + ", subject=" + subject + ", intermediate=" + intermediate + "]";
	}
	
	
	
}
