package demo;

import java.util.Scanner;

public class Util {
	
	public static String getUserInput(String inputString) {

		// Using Scanner for Getting Input from User
		System.out.println("Please enter the details for :" + inputString);
		Scanner inputScannerObject = new Scanner(System.in);
		return inputScannerObject.nextLine();

	}

	public static void displayUserInput(String displayString) {
		System.out.println(displayString);

	}
	
	//Method to check the password strength 
	//Check 1 : Length of the password >= 8
	//Check 2 : Must contain 1 Alphabet 1 Special Character and 1 Number
	public static boolean checkPasswordStrength (String passwordToCheck) {
		return false;
		
	}
	
}
