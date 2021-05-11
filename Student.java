package campThirdDay;

public class Student extends User {
	private String firstName;
	private String lastName;
	private String lectureName;
	
	public Student() {
		
	}

	public Student(String firstName, String lastName, String lectureName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.lectureName = lectureName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getLectureName() {
		return lectureName;
	}

	public void setLectureName(String lectureName) {
		this.lectureName = lectureName;
	}
	
	
}
