package Core.BasicProgram;

public class University {

	private String UniversityName;
	private int UniversityId;
	private String UniversityAddress;
	private Student student;
	
    public University() {
    	System.out.println("University class default constructor");
	}
    

	public University(String universityName, int universityId, String universityAddress, Student student) {
		super();
		System.out.println("\u001B[33m"+"University class Parameterized constructor"+"\u001B[0m");
		this.UniversityName = universityName;
		this.UniversityId = universityId;
		this.UniversityAddress = universityAddress;
		this.student = student;
	}


	public String getUniversityName() {
		return UniversityName;
	}

	public void setUniversityName(String universityName) {
		System.out.println("University name setter called");
		UniversityName = universityName;
	}

	public int getUniversityId() {
		return UniversityId;
	}

	public void setUniversityId(int universityId) {
		System.out.println("University id setter called");
		UniversityId = universityId;
	}

	public String getUniversityAddress() {
		return UniversityAddress;
	}

	public void setUniversityAddress(String universityAddress) {
		 System.out.println("University address setter called");
		UniversityAddress = universityAddress;
	}
	

	public Student getStudent() {
		return student;
	}


	public void setStudent(Student student) {
		this.student = student;
	}


	@Override
	public String toString() {
		return "University [UniversityName=" + UniversityName + ", UniversityId=" + UniversityId
				+ ", UniversityAddress=" + UniversityAddress + ", student=" + student + "]";
	}


	/*@Override
	public String toString() {
		return "University UniversityName=" + UniversityName + ", UniversityId=" + UniversityId
				+ ", UniversityAddress=" + UniversityAddress ;
	}*/

	

}
