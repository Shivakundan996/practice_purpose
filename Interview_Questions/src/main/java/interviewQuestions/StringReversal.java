package interviewQuestions;

import java.util.ArrayList;
import java.util.List;

//Reverse a string in java
public class StringReversal {
	
	public static void main(String[] args) {

		//1st type
		StringBuilder sb = new StringBuilder("jai shree krishna");
		String reverse = sb.reverse().toString();
		System.out.println("1st type is :" + reverse);


		//2nd type
		String s = "jai shree krishna";
		System.out.print("2nd type is: ");
		for (int i = s.length() - 1; i >= 0; i--) {
			System.out.print(s.charAt(i));
		}
	}

}
