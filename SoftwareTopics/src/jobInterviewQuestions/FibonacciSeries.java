package jobInterviewQuestions;

import java.util.Scanner;

/*
 * Java program to calcuate and print Fibonacci number using both recursion 
 * and Iteration.
 * 
 * Fibonaci number is sum of previous two Fibonacci numbers fn = fn-1+ fn-2
 * First 10 Fibonacci numbers are 1,1,2,3,5,8,13,21,34,55.
 */

public class FibonacciSeries {
	
	public static void main(String args[]) {
		
		//Input to let user choose how many numbers he want to use
		System.out.println("Enter number upto which Fibonacci series to print:");
		int number = new Scanner(System.in).nextInt();
		
		System.out.println("Fibonacci series upto " + number + " numbers: ");
		//Printing Fibonacci series upto number
		
		for(int i=1; i<= number; i++) {
			System.out.println(fibonacci2(i)+ " ");
		}
	}
	
	//Recursion way of solving this problem
	public static int fibonacci(int number) {
		if(number == 1 || number == 2) {
			return 1;
		}
		
		return fibonacci(number-1) + fibonacci(number - 2); //Tail recursion
	}
	
	//How to calculate number using loop or iteration.
	public static int fibonacci2(int number) {
		if(number == 1 || number == 2 ) {
			return 1;
		}
		
		int fibol1 = 1, fibol2=1, fibonacci=1;
		for(int i = 3; i <= number; i++) {
			//Fibonacci number is sum of previous two Fibonacci number
			fibonacci = fibol1 + fibol2;
			fibol1 = fibol2;
			fibol2 = fibonacci;
		}
		
		return fibonacci; //Fibonacci number
	}
}
