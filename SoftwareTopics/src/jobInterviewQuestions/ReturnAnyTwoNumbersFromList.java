package jobInterviewQuestions;

import java.awt.List;
import java.util.ArrayList;

//Given a list of numbers and a number k, return wather any two numbers from the list adds up to k
public class ReturnAnyTwoNumbersFromList {

	public static void main(String[] args) {

		int givenNumber = 12;
		int[] numberList1 = new int[] { 10, 8, 2, 6 };

		Boolean doesItAddUp = ReturnAnyTwoNumbersFromList.ReturnNumber(numberList1, givenNumber);

		System.out.println("Does the number add up: " + doesItAddUp);

	}

	// If number adds up to the list then return true
	public static boolean ReturnNumber(int[] list, int number) {

		ArrayList<Integer> identityList = new ArrayList<Integer>();
		ArrayList<Integer> dataToReturn = new ArrayList<Integer>();

		for (int numbersInList : list) {
			identityList.add(numbersInList);
		}

		for (int numberElement : identityList) {

			for (int i = 0; i < list.length; i++) {
				int element = identityList.get(i);
				int intToReturn = numberElement + element;
				dataToReturn.add(intToReturn);

				if (number == intToReturn) {
					System.out.println(dataToReturn);
					return true;
				}
			}
		}
		System.out.println(dataToReturn);
		return false;
	}
}
