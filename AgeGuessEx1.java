
//Program reads an age guess from the user and displays answer.

import java.util.Scanner;
import java.util.Random;

public class AgeGuessEx1 {

	public static void main(String[] args) {
		
		//Age to be guessed is randomly initialized to be less than 101 years.
		
		int ageGuess, age;
		Random generator = new Random();
		age = generator.nextInt(101);
	
		Scanner scan = new Scanner(System.in);
		
		  System.out.print("Guess my age! Please enter your guess here:");
		
		ageGuess = scan.nextInt();
		
		  System.out.println("You guessed:" + ageGuess + " My actual age is: " + age);
		

	}

}
