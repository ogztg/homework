package campThirdDay;

public class User {
	private int id;
	private String email;
	private String password;
	private String courseName;
	public User() {
		
	}

	public User(int id, String email, String password, String courseName) {
		super();
		this.id = id;
		this.email = email;
		this.password = password;
		this.courseName = courseName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	
}
