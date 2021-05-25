package classes;

public class PasswordValidator {
	public boolean isValid(String pw) {
		if (pw.length()>=5 && pw.length()<=10)
		return true;
		else
		return false;
		}
}
