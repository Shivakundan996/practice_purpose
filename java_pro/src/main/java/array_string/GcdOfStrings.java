package array_string;

/**
 * For two strings s and t, we say "t divides s" if and only if s = t + ... + t 
 * (i.e., t is concatenated with itself one or more times).

Given two strings str1 and str2, return the largest string x such that x divides both str1 and str2.

 

Example 1:

Input: str1 = "ABCABC", str2 = "ABC"
Output: "ABC"

Example 2:

Input: str1 = "ABABAB", str2 = "ABAB"
Output: "AB"
 */
public class GcdOfStrings {
	public static String gcdOfStrings(String str1, String str2) {
       String s3 = null;
       if(str1.length()>str2.length()) {
    	   s3 = str1.substring(0,str2.length());
       }else {
    	   s3 = str2.substring(str1.length());
       }
       return s3;
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Integer.MAX_VALUE);
		System.out.println(gcdOfStrings("ABCABCD", "ABC"));
	}



}
