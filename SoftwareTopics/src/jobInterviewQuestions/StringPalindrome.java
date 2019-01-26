package jobInterviewQuestions;

import java.lang.reflect.Array;
import java.util.Scanner;

/*
	 * This small application checks if a given string is a palindrome or not.
	 * 
	 * A palindrome is a word which spells the same backwards as forward. 
	 */

public class StringPalindrome {
	
	public static void main(String args[]) {
		
		// Insert your word.
		System.out.println("Enter a word: ");
		String word = new Scanner(System.in).next();
		
		System.out.println("Is " + word + " a palindrome? : " + IsThisWordPalindrome(word));
		
	}
	
	//How to solve this task easily by making use of StringBuilder.
	public static boolean IsThisWordPalindrome(String word) {
		
		String reverse = new StringBuilder(new String(word)).reverse().toString();
		
		if(word.equals(reverse)) {
			return true;
		}
		return false;
	}
}
