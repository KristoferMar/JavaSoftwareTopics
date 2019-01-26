package jobInterviewQuestions;

import java.util.Scanner;

/*
 * This small application checks if a given int is a palindrome or not. 
 * A palindrome is a word which spells the same backwards as forward. 
 * In our canse its int so 1001 is but 1234 is not.
 */

public class IntPalindrome {

	public static void main(String args[]) {

		// Input to let user choose how many numbers he want to use
		System.out.println("Enter number: ");
		int number = new Scanner(System.in).nextInt();
		
		if(IsThisIntPalindrome(number)) {
			System.out.println("Number : " + number + " is a palindrome");
		} else{
			System.out.println("Number : " + number + " is not a palindrome");
		}
	}
	
	//Java method to check if number is palindrome or not.
	public static boolean IsThisIntPalindrome(int numbers) {
		
		int palindrome = numbers;
		int reverse = 0;
		
		//I use devide by 10 and reduce the number and modulus 10 to get the last digit
		//This trick is known to solve a problem like this.
		while(palindrome != 0) {
			int remainder = palindrome % 10;
			reverse = reverse * 10 + remainder;
			palindrome = palindrome / 10;
		}
		
		if(numbers == reverse) {
			return true;
		}
	
		return false;
	}
}
