package com.techelevator;

import java.util.Scanner;			// Remember to always activate this if we're going to use scanner.

public class Fibonacci {			// the name has to match the file name

	public static void main(String[] args) {                // starting the main, making it public to the program,

//		TODO - Write a command-line program which prompts the user for an integer value and display the Fibonacci sequence leading up to that number:

		// Activating the input scanner
		Scanner console = new Scanner(System.in);

		// Friendly introduction giving the program a title and purpose to the user
		System.out.println("Greetings!  Welcome to Reg's Fibonacci Program.");

		// Task 1 - Prompt user for an integer value
		System.out.print("Please enter an integer value and I shall display the Fibonacci sequence leading up to that number:");

		// Of Note - We are NOT showing the math as we increment, only the sums.  Code accordingly

		int n = console.nextInt();
		if (n > 1) {

			// Telling user what they will be seeing next
			System.out.println("The Fibonacci numbers less than " + n + "are: ");
			System.out.print("1, 1, ");
			int counter = 1;
			int currentValue = 1;

			// Here is the loop that runs the counter
			for (int i = 1; i + counter < n; ) {
				currentValue = i + counter;
				i = counter;
				counter = currentValue;
				System.out.print(currentValue+ ", ");

			}
		} else {
			System.out.println("There are no numbers less than " + n + " in the series");
		}
	}


}

// public static void main(String [] args){
//    Scanner console = new Scanner(System.in);
//    System.out.println("Enter an integer: ");
//    int n = console.nextInt();
//    if(n>1) {
//        System.out.println("The Fibonacci numbers less than " + n + " are: ");
//        System.out.print("1, 1, ");
//        int f2=1;
//        int fibonacci=1;
//        for(int i=1; i+f2 < n;){
//            fibonacci = i + f2;
//            i = f2;
//            f2 = fibonacci;
//            System.out.print(fibonacci+", ");
//        }
//    } else {
//        System.out.println("There are no numbers less than " + n + " in the series");
//    }
//}






