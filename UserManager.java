package campSecondDay;

public class UserManager {
	public void addUser(User user) {
		System.out.println("Kullan�c� ad�n�z : " + user.userName);
	}
	public void updateUser(User user) {
		System.out.println("Email ba�ar�yla g�ncellendi: "+ user.email);
	}
}
