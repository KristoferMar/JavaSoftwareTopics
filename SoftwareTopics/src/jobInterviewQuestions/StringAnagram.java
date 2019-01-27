package jobInterviewQuestions;

import java.util.Arrays;

/*
 * Java program - String anagram checking
 * 
 * If two words are anagram it means they include the same characters and length but in a different order.
 * Mary and army, are anagrims.
 * 
 */

public class StringAnagram {
	
	public static void main(String args[]) {
		
		System.out.println(IsAnagram("mary", "army"));
		
		System.out.println(isAnagram2("mary", "army"));

	}
	
	//This method assumes both arguments are not null and in lowercase.
	public static boolean IsAnagram(String word, String anagram) {
		//We ensure that the length are the same.
		if(word.length() != anagram.length()) {
			return false;
		}
		
		char[] chars = word.toCharArray();
		
		for(char c : chars) {
			int index = anagram.indexOf(c);
			if(index != -1) {
				anagram = anagram.substring(0, index) + anagram.substring(index +1, anagram.length());
			}else {
				return false;
			}
		}
		
		return anagram.isEmpty();
	}
	
	//A very simple way of doing it.
	public static boolean isAnagram2(String word, String anagram) {
		char[] charFromWord = word.toCharArray();
		char[] charFromAnagram = anagram.toCharArray();
		Arrays.sort(charFromWord);
		Arrays.sort(charFromAnagram);
		
		return Arrays.equals(charFromWord, charFromAnagram);
	}
}
