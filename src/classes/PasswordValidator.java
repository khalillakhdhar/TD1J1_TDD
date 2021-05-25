package classes;

public class PasswordValidator {
	public static boolean isValid(String pw) {
		if (pw.length()>=5 && pw.length()<=10)
		return true;
		else
		return false;
		}
}
