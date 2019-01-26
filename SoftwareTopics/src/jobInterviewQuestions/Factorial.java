package jobInterviewQuestions;

import java.util.Scanner;

/*
 * A small application on how to find the factorial of a number in java.
 * 
 * A factorial is 5! = 5*4*3*2*1 = 120.
 */

public class Factorial {

	public static void main(String args[]) {

		// Input to let user choose how many numbers he want to use
		System.out.println("Enter number: ");
		int number = new Scanner(System.in).nextInt();

		System.out.println("Factorial of " + number + " is " + GetFactorialIteration(number));
	}

	//Iterational implementation
	public static int GetFactorialIteration(int number) {
		int totalValue = 1;
		
		for(int i = 1; i <= number; i++) {
			totalValue = totalValue * i;
		}
		
		return totalValue;	
	}
	
	//Iterational implementation with While loop.
	public static int GetFactorialWhileLoopIteration(int number) {
		int result = 1;
		
		while(number != 0) {
			result = number*result;
			number--;
		}
		return result;
	}
	
	//Recursive implementation.
	public static int factorial(int number) {
		//Base case
		if(number == 0) {
			return 1;
		}
		return number*factorial(number-1); //Tail recursion
	}
}
