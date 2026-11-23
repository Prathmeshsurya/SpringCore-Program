package SpringCore.FirstApp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class A{
 int a =100;
  A(){
	  System.out.println("A class Constructor");
  }
  @Override
  public String toString() {
	return "A [a=" + a + "]";
  }
}
 
 
  class B{
	  int b =200;
	  B(){
		  System.out.println("b class Constructor");
	  }
	  @Override
	  public String toString() {
		return "B [b=" + b + "]";
	  }
  }
  
  public class App1{
	  public static void main(String[] args) {
		
		 /* 
		  A a = new A();
		  System.out.println(a);
		  
		  B b = new B();
		  System.out.println(b);*/
		  
		  ApplicationContext context = new ClassPathXmlApplicationContext("\\SpringCore\\FirstApp\\application-context.xml");
		  
		 A bean= context.getBean("FirstClass",A.class);
		 System.out.println(bean);
		 
		 B bean2 = context.getBean("SecClass",B.class);
		 System.out.println(bean2);
	}
  }