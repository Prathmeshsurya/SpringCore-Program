package Core.BasicProgram;

public class Student {

	private String name;
	private int id;
	private String address;
	
	
     public Student() {
		System.out.println("Student class default constructor");
	}
	

	public Student(String name, int id, String address) {
		//super();
		System.out.println("\u001B[32m"+"Student class Parametrized constructor"+"\u001B[0m");

		this.name = name;
		this.id = id;
		this.address = address;
	}



	public String getName() {
		return name;
	}
	public void setName(String name) {
		System.out.println("Student name setter called");
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		System.out.println("Student id setter called");
		this.id = id;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		 System.out.println("Student address setter called");
		this.address = address;
	}
	
	

	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", address=" + address + "]";
	}
	
	/*@Override
	public String toString() {
	    return "Student [name=" + name
	            + ", id=" + id
	            + ", address=" + address
	            + ", university=" + university + "]";
	}*/

}
