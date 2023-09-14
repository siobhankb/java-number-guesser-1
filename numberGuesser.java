/*
Name:           Siobhan Boylan
Date:           September 8, 2023
description:    a Java console game where the user must guess
                a randomly selected number.
*/

import java.util.Scanner;
import java.util.Random;

public class numberGuesser
{

    // function: number guessing game
    public static void guessingNumberGame()
    {
    	// new Scanner
    	Scanner console = new Scanner(System.in);
        
        // new Random
        Random rando = new Random();
    
    	// Generate the number
    	int myNumber = rando.nextInt(100) + 1;
    
    	// Give user instructions
    	System.out.println("Can you guess my number? (between 1-100)???");
    
    	// set up variable to capture input
        int guess = -1;
        
        
        // otherwise enter while-loop
    	
        // continue loop until 
        // user input guess == myNumber
        while (guess != myNumber) {
    
    		System.out.println("Take a guess: ");
    
    		// Get user's guess
    		guess = console.nextInt();
    
    		// If user guesses number
    		if (myNumber == guess) {
    			System.out.println(
    				"Congratulations! You guessed my number.");
    		}
    		else if (myNumber > guess) {
    			System.out.println(
    				"My number is greater than " + guess);
    		}
    		else if (myNumber < guess) {
    			System.out.println(
    				"My number is less than " + guess);
    		}
    	}
    }
    // Main Code
    public static void
    main(String arg[])
    {
    
    	// Call the function
    	//guessingNumberGame();
        System.out.print("1");
        for (int i = 2; i <=10;i++) {
            System.out.printf("%4d", (i));
        }
        
    }
}


