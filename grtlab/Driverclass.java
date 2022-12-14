package grtlab;

import java.util.Scanner;

import greatlearning.model.Employee;

public class Driverclass { 
	
		public static void main(String[] args) {
	        Employee employee = new Employee("bhavya","kavuri");

	        String generatedEmail ;

	        char[] generatedPassword ;
	        CredentialService cService = new CredentialService();

	        System.out.println("Please enter the department from the following"  );
	        System.out.println("1.Technical Department");
	        System.out.println("2.Admin Department");
	        System.out.println("3.Human Resource Department");
	        System.out.println("4.Legal Department");


	        Scanner in = new Scanner(System.in);
	        int choice = in.nextInt();

	        switch (choice){
	            case 1:
	                generatedEmail = cService.generateEmailAddress(employee.getFirstName(),employee.getLastName(),"Tech");
	                generatedPassword = cService.generatePassword();
	                cService.showCredentials(employee, generatedEmail,generatedPassword);
	                break;

	            case 2:
	                generatedEmail = cService.generateEmailAddress(employee.getFirstName(),employee.getLastName(),"Admin");
	                generatedPassword = cService.generatePassword();
	                cService.showCredentials(employee, generatedEmail,generatedPassword);
	                break;
	            case 3:
	                generatedEmail = cService.generateEmailAddress(employee.getFirstName(),employee.getLastName(),"HR");
	                generatedPassword = cService.generatePassword();
	                cService.showCredentials(employee, generatedEmail,generatedPassword);
	                break;
	            case 4:
	                generatedEmail = cService.generateEmailAddress(employee.getFirstName(),employee.getLastName(),"Legal");
	                generatedPassword = cService.generatePassword();
	                cService.showCredentials(employee, generatedEmail,generatedPassword);
	                break;
	            default:  System.out.println("enter the valid choice");
	            break;

	        }
		}
}
