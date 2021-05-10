package campSecondDay;

public class User {
	int id;
	String firstName;
	String lastName;
	String userName;
	String email;
	public User() {
		
	}
	public User(int id, String firstName, String lastName, String userName, String email) {
		this();
		this.id = id;
		this.email = email;
		this.firstName = firstName;
		this.lastName = lastName;
		this.userName = userName;
	}
}
