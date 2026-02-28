package week6;

import java.util.Scanner;
public class FullNameAPP {
	
	// This program asks the user for each part of their full name and then puts it together.
	
	static Scanner userinput = new Scanner(System.in);
	public static void main(String[] args) {
		
		// Declare the variables:
		String firstName;
		String middleName;
		String lastName;
		String fullName;
		
		// Tell the user what the program does:
		System.out.println("This program will ask for each part of your full name and then put them together.");
		
		// Ask the user to input their name:
		System.out.println("Provide the following information:");
		System.out.print("First name: ");
		firstName = userinput.nextLine();
		System.out.print("Middle name: ");
		middleName = userinput.nextLine();
		System.out.print("Last name: ");
		lastName = userinput.nextLine();
		
		// Combine the three separate parts of the user's name into one string:
		fullName = firstName + " " + middleName + " " + lastName;
			
		// Print the user's full name:
		System.out.println("Your full name is " + fullName);
		
	}

}