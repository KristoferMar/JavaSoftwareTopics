package jobInterviewQuestions;

/*
 * Java application to reverse a number in java using loop and operator.
 * 
 */

public class ReverseANumber {
	
	public static void main(String args[]) {
		
		System.out.println(reverse(12345));
		
	}
	
	//A simple method to reverse a number.
	public static int reverse(int number) {
		int reverse = 0;
		int remainder = 0;
		
		do {
			remainder = number%10;
			reverse = reverse*10 + remainder;
			//this gives us 123,4 and becuase we have ints the rest will become 123.
			number = number/10;
		}while(number > 0); {
			return reverse;
		}
	}
}
