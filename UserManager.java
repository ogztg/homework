package campSecondDay;

public class UserManager {
	public void addUser(User user) {
		System.out.println("Kullanýcý adýnýz : " + user.userName);
	}
	public void updateUser(User user) {
		System.out.println("Email baþarýyla güncellendi: "+ user.email);
	}
}
