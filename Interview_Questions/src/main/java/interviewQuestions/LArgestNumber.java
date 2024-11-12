package interviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//write a program to generate the largest number possible using these digits
	//input arr[]={8, 6, 0, 4, 6, 4, 2, 7}
	//Output : Largest number: 87664420
public class LArgestNumber {
	
	public static void main(String[] args) {
	int arr[]={8, 6, 0, 4, 6, 4, 2, 7};
	Arrays.sort(arr);
	
	String str="";
	
	for(int i=arr.length-1; i>=0; i--) {
		str=str + arr[i]; 
	}
	
	System.out.println(arr);
	System.out.println(str);
		
	}

	
	



}
