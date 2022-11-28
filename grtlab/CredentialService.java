package grtlab;

import java.util.Random;

import greatlearning.model.Employee;

public class CredentialService {
	public char[] generatePassword() {
		String capitalLetters= "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smallLetters="abcdefghijklmnopqrstuvwxyz";
		String numbers="0123456789";
		String specialCharacters="!@#$%^&*_=+-/.?<>";
		String values = capitalLetters + smallLetters + numbers + specialCharacters;
		Random random = new Random();
		char[] password=new char[8];
		for(int i=0;i<8;i++) {
			password[i]=values.charAt(random.nextInt(values.length()));
		}
		return password;	
	} 
	public String generateEmailAddress(String firstName, String lastName, String dept) {
		String generatedEmail= firstName + lastName + "@" + dept + ".civils.com";
		return generatedEmail;
		
	}
	public void showCredentials(Employee employee, String email, char[] generatedPassword) {
		System.out.println(" Hi  " + employee.getFirstName() +   "  your generated credentials are as follows  " );
		System.out.println("email is:  " +email);
		char[] generatedPassword2 = generatedPassword;
		System.out.println("password is:  " +generatedPassword2);
	}
}
