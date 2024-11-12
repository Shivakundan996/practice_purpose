package array_string;

public class ReverseVowels {
	public static String reverseVowels(String s) {
		String[] s1 = s.split("");
        int i=0,j=s1.length-1;
        String vowels ="aeiouAEIOU";
        
        while(i<j){
        	
            if( vowels.contains(s1[i]) && vowels.contains(s1[j]) ){

                String temp=s1[i];
                s1[i]=s1[j];
                s1[j]=temp;
                i++;
                j--;

            }
        else if (!vowels.contains(s1[i])) {
            i++;
        } else if (!vowels.contains(s1[j])) {
            j--;
        }
        }
        return String.join("", s1);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reverseVowels("leetcode"));
	}

}
