import java.util.regex.Pattern;

@FunctionalInterface
interface UserRegistrationInterface {
	boolean validate(String a,String b);
}

public class UserRegistrationLamda {

	public static void main(String[] args) {
		UserRegistrationInterface firstName = (String pattern, String fname) -> {
			if (Pattern.matches(pattern, fname)) {
				System.out.println("True");
				return true;
			}else {
				System.out.println("False");
				return false;
			}
		};
		UserRegistrationInterface lastName = (String pattern, String lname) -> {
			if (Pattern.matches(pattern, lname)) {
				System.out.println("True");
				return true;
			}else {
				System.out.println("False");
				return false;
			}
		};
		UserRegistrationInterface email = (String pattern, String Email) -> {
			if (Pattern.matches(pattern, Email)) {
				System.out.println("True");
				return true;
			}else {
				System.out.println("False");
				return false;
			}
		};
		UserRegistrationInterface phoneNo = (String pattern, String Num) -> {
			if (Pattern.matches(pattern, Num)) {
				System.out.println("True");
				return true;
			}else {
				System.out.println("False");
				return false;
			}
		};
		UserRegistrationInterface passWord = (String pattern, String pass) -> {
			if (Pattern.matches(pattern, pass)) {
				System.out.println("True");
				return true;
			}else {
				System.out.println("False");
				return false;
			}
		};


		firstName.validate("^[A-Z][a-z]{2,}$", "Shivam");
		firstName.validate("^[A-Z][a-z]{2,}$", "Sh");

		lastName.validate("^[A-Z][a-z]{2,}$", "Armarkar");
		lastName.validate("^[A-Z][a-z]{2,}$", "Ar");

		email.validate("^[a-zA-Z0-9_-]+(?:\\.[a-zA-Z0-9_+-]+)*@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$","shivam.armarkar@gmail.com");
		email.validate("^[a-zA-Z0-9_-]+(?:\\.[a-zA-Z0-9_+-]+)*@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$","shivagmail.com");

		phoneNo.validate("^[9][1]{0,1}\\s[0-9]{10}", "91 8664121475");
		phoneNo.validate("^[9][1]{0,1}\\s[0-9]{10}", "91 86641214");

		passWord.validate("(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&*()_-])[a-zA-Z0-9].{8,}$","Sagar@123");
		passWord.validate("(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&*()_-])[a-zA-Z0-9].{8,}$","Sagar@");

	}
}
