package interviewQuestions;

import java.util.Arrays;
import java.util.List;

/**
 * program to count number of vowels in a String
 * 
 * @author shivakundan.pr
 *
 */

public class Vowels_In_String {
	public static void main(String[] args) {
		String s = "hello    java  ";

		// to remove spaces in string
		String s1 = s.replaceAll("\\s", "");

		String vowel = "aeiou";
		List<Character> vowels = Arrays.asList('a', 'e', 'i', 'o', 'u');

		int count = 0;

		for (int i = 0; i < s1.length(); i++) {
			if (vowels.contains(s1.charAt(i)))
				count++;

		}
		System.out.println(count);
	}

}
