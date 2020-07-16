//A program that reads user names and then prints a string.

import java.util.Scanner;
import java.util.Random;


public class UserNames {

	
	public static void main(String[] args) {
		
		String firstName, lastName, subString, firstLetter;
		int randomNumber;
		
		Scanner scan = new Scanner(System.in);
		Random generator = new Random();
		
		randomNumber = generator.nextInt(89)+10;
		
		System.out.println("Please type your first name:");
		
		firstName = scan.nextLine();
		
		System.out.println("Please type your last name:");
		
		lastName = scan.nextLine();
		
		// select first 4 letters of last name
		subString = lastName.substring(0,4);
		
		// select first letter of first name
		firstLetter = firstName.substring(0,1);
		 
		
		System.out.println(subString + firstLetter + randomNumber);
		
		
		
	}

}
