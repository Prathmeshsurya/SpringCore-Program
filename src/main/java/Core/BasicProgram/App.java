package Core.BasicProgram;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
		
  /*  	Student student = new Student();
    	student.setName("Prathmesh");
    	student.setId(101);
    	student.setAddress("Pune");
    	
    	System.out.println(Sstudent);
    	
    	University university =  new University();
    	university.setUniversityName("SPPU");
    	university.setUniversityId(1010);
    	university.setUniversityAddress("Mumbai");
    	System.out.println(university);  */
    	
    	ApplicationContext  context = new ClassPathXmlApplicationContext("core/Basicprogram/application-context.xml");
    	University bean =context.getBean("UniversityClass",University.class);
    	  System.out.println(bean);
	}
}
