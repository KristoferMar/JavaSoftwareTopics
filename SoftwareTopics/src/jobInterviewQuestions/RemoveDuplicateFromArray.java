package jobInterviewQuestions;

/*
 * A small java application which removes a dupblication in an array.
 */

public class RemoveDuplicateFromArray {
	
	public static void main(String args[]) {
		
		int arr[] = {10, 20, 20, 3, 3, 30, 30, 40, 50, 50};
		int length = arr.length;
		length = removeDuplicateElements(arr, length);
		//Printing array elements
		for(int i =0; i<length; i++) {
			System.out.println(arr[i]+ " ");
		}
	}
	
	//Algoritm to remove duplicate element in Array using Temporary Array.
	public static int removeDuplicateElements(int arr[], int n) {
		if(n==0 || n==1) {
			return n;
		}
		
		int[] temp = new int[n];
		//J is the new array with removed dublicates.
		int j = 0;
		for(int i=0; i<n-1; i++) {
			if(arr[i] != arr[i+1]) {
				temp[j++] = arr[i];
			}
		}
		temp[j++] = arr[n-1];
		
		//We now change the original array.
		for(int i=0; i<j; i++) {
			arr[i] = temp[i];
		}
		return j;
	}

}
