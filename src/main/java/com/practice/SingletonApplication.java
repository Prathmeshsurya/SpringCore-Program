package com.practice;

 class SingletonApplication {

	  private static SingletonApplication ref ;
	  
	  private SingletonApplication() {
		  
	  }
	  
	 /* public static void main(String[] args) {
		  ref = new SingletonApplication();
		  System.out.println("Object Created SUCCESSFULLY");
	}*/
	  
	 public static SingletonApplication getObject() {
		  
		  if(ref==null) {
			  
			  ref= new SingletonApplication();
		  }
		  
		  return ref;
	  }
}
