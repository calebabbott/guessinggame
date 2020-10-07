package learning_program;

import java.util.Scanner;

import java.util.Random;

public class Randomtutorial {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random num = new Random();

		
		int valRange = 50;
		
		int randomVal = num.nextInt(valRange);
		
		int val = 0;
		
		int attemptsNum = 0;
		
		final int maxAttempts = 5;
		
		String choice = "y";
		
		while (choice.equalsIgnoreCase("y")) {
		
		//System.out.println("Your random number is: " + randomVal);
		System.out.println("Welcome to the number guessing game!");
		System.out.println("You get 5 tries to guess a number between 1-50.");
			
			do { 
				System.out.println("Enter a number: ");
				val = sc.nextInt();
			
				if (val == randomVal)
					System.out.println("You win! The number was "+randomVal+"!");
				else if (val < randomVal) { 
					System.out.println("The number is higher!");
				}
				else if (val > randomVal) {
					System.out.println("The number is lower!");
				}
					
				} while(val != randomVal && ++attemptsNum < maxAttempts);
				
				if (attemptsNum == maxAttempts)
				System.out.println("You loose! The number was "+randomVal+".");
		
			System.out.print("Continue? (y/n): ");
			choice = sc.next();
			attemptsNum = 0;
			randomVal = num.nextInt(valRange);
			System.out.println();
		
		
		}
		System.out.println("Bye!");
		
		}
}
