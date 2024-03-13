package task1;

import java.util.Scanner;
import java.util.Random;

public class NumberGuess {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in); 
		Random random=new Random();
		int minRange=1;
		int maxRange=100;
		int targetNumber=random.nextInt(maxRange-minRange+1)+minRange;
		int maxAttempts=5;
		int attempts=0;
		
		System.out.println("Welcome to the number guessing game!!!");
		System.out.println("Rules: "+'\n' +"1. You will be asked to guess a number to win the game"
				+'\n' + "2. You have maximum 5 attempt limit ");
		System.out.println("I've picked a number between " + minRange + " and " + maxRange + ". Can you guess it?");
		
    while(attempts<maxAttempts) {
    	System.out.println("Enter your guess: ");
    	int guess=sc.nextInt();
    	attempts++;
    
    if(guess==targetNumber) {
    	System.out.println("Congratulations! You've guessed the correct number in " + attempts + " attempts.");
          return;
    }else if(guess<targetNumber) {
    	System.out.println("Too low! Try again");
    }else {
    	System.out.println("Tow high! Try again");
    }
    }
    System.out.println("Sorry, you've used all your attempts. The correct number was: " + targetNumber);

		
	}

}
