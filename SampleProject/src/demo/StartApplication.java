package demo;

import java.util.Scanner;

public class StartApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Sample Project Run Started");

	
		
		User user = new User(Util.getUserInput("userName"),Util.getUserInput("userPassword"));
		
		System.out.println(user);

	}

	// Get the input from the console.
	

}
