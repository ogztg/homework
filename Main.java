package campThirdDay;

public class Main {

	public static void main(String[] args) {
		
		Student student = new Student();
		student.setId(2);
		student.setLectureName("Java + React");
		student.setFirstName("Oguz");
		student.setLastName("Tuğ");
		student.setEmail("oguztug@gmail.com");
		student.setCourseName("Yazilim Gelistirici Kampi");
		student.setPassword("1252");
		
		Instructor instructor = new Instructor();
		instructor.setId(3);
		instructor.setFirstName("Engin");
		instructor.setLastName("Demirog");
		instructor.setCourseName("Java + React");
		
		User user = new User();
		user.setId(1);
		user.setEmail("user@gmail.com");
		user.setPassword("213131");
		
		StudentManager studentManager = new StudentManager();
		studentManager.studentSelectCourse(student);
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.instructorInfo(instructor);
		
		UserManager userManager = new UserManager();
		userManager.userAdd(user);
	}

}
