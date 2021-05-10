package campSecondDay;

public class Main {

	public static void main(String[] args) {
		Course course1 = new Course(1,"C# + Angular", "Yazılım Geliştirici Kampı");
		Course course2 = new Course(2, "Java + React", "Yazılım Geliştirici Kampı");
		Course course3 = new Course(3, "Programlamaya Giriş İçin Temel Kurs", "Yazılım Geliştirici Kampı");
		
		Course[] courses = {course1, course2, course3};
		for(Course course : courses) {
			System.out.println(course.name + "/" + course.detail);
		}
		courseManager courseManager = new courseManager();
		courseManager.addCourse(course1);
		courseManager.addCourse(course2);
		courseManager.addCourse(course3);
		
		courseManager.deleteCourse(course3);
		
		User user1 = new User(1, "oguz", " tug", "ogztg", "oguztug@gmail.com");
		User user2 = new User(2, "ali", " veli", "lvl", "aliveli@gmail.com");
		
		User[] users = {user1, user2};
		for(User user : users) {
			System.out.println(user.firstName + user.lastName);
		}
		UserManager userManager = new UserManager();
		userManager.addUser(user2);
		userManager.updateUser(user1);
	}

}
