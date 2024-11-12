package array_string;

public class ReverseWords {
	
	public static String reverseWords(String s) {
        String[] str=s.split(" ");
        System.out.println(str.length);
        int i=0;
        int j=str.length-1;
        while(i<j){
            String temp = str[i]; //the 
            str[i++] = str[j];
            str[j--] = temp;
        }

        return String.join(" ", str);
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reverseWords("the sky is blue"));
	}

}
