package com.practice;


class Application1{
	
	public void fetchObject() {
		
		SingletonApplication sp1 = SingletonApplication.getObject();
		System.out.println(sp1.hashCode());
	}
}

class Application2{
	public void fetchobject() {
		SingletonApplication sp2 = SingletonApplication.getObject();
		System.out.println(sp2.hashCode());
	}
}
public class Main {

	 public static void main(String[] args) {
		Application1 app1 = new Application1();
		Application2 app2 = new Application2();
		
		app1.fetchObject();
		app2.fetchobject();
	}
}
