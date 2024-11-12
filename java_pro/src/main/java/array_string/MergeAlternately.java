package array_string;

/**
 * You are given two strings word1 and word2. 
 * Merge the strings by adding letters in alternating order, starting with word1. 
 * If a string is longer than the other, append the additional letters onto the end of the merged string.
 */

public class MergeAlternately {
	
public static String mergeAlternately(String word1, String word2) {
	String word3 = "";
	
	int n= Math.min(word1.length(),word2.length());
	
    
	for(int i=0; i < n; i++) {
		word3=word3 + word1.charAt(i) + word2.charAt(i);
	}
	
	if(word1.length() > n){
        word3+=word1.substring(n);
    }else{
        word3+=word2.substring(n);
    }
	
	return word3;
    }

public static void main(String[] args) {
	String word1="ab";
	String word2="pqrs";
	System.out.println(mergeAlternately(word1,word2));
}

}
