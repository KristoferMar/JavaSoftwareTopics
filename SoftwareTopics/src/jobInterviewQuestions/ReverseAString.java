package jobInterviewQuestions;

import java.util.Scanner;

/*
 * A small application which will reverse a given string.
 * 
 */

public class ReverseAString {

	public static void main(String args[]) {
		
		// Insert your word.
		System.out.println("Enter a word: ");
		String string = new Scanner(System.in).next();

		System.out.println("Word reversed: " + ReversedString(string));
	}

	//100% the easiest way of reversing a string.
	public static String ReversedString(String string) {
		return new StringBuilder(new String(string)).reverse().toString();
	}
	
	//The Algorithm used to reverse a string
	public static String reverseAlgorithm(String source) {
		if(source == null || source.isEmpty()) {
			return source;
		}
		String reverse = "";
		for(int i = source.length()-1; i>=0; i--) {
			reverse = reverse + source.charAt(i);
		}
		
		return reverse;
	}

}
