package jobInterviewQuestions;

import java.util.Scanner;

/*
 * This is a small application which checks if a given number is a prime number.
 * 
 * A prime number is a number that is only divisible by 1 or itself. For example, 11 is only divisible by 1 or itself. Other Prime numbers 2, 3, 5, 7, 11, 13, 17....
 */

public class PrimeNumbers {

	public static void main(String args[]) {

		// Input to select number.
		System.out.println("Enter number: ");
		int number = new Scanner(System.in).nextInt();
		
		System.out.println("Is " + number + " a prime number? : " +IsThisAPrimeNumber(number));
	}

	public static boolean IsThisAPrimeNumber(int number) {
		int reminder;
		for (int i = 2; i <= number / 2; i++) {
			reminder = number % i;
			// If remainder is 0 than numberToChecker is not prime and breaks. else
			// continue.
			if (reminder == 0) {
				return false;
			}
		}
		return true;
	}
}
