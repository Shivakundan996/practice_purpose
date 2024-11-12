package interviewQuestions;

import java.util.Arrays;

public class CheckArraysEquality {

	/*
	 * check whtether elements in array are equal or not
	 */
	public static void main(String[] args) {

		int[] arr1= {1,3,6,4};
		int[] arr2= {3,2,4,6};
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		System.out.println(Arrays.toString(arr1));
		
		boolean equals = Arrays.equals(arr1,arr2);
		if(equals==true) {
			System.out.println("arrays are equal");
		}
		else {
			System.out.println("not equal");
		}
		
	}

}
