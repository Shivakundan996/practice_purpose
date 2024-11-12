package array_string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//input:"5120300"
//output : 51203

public class RemoveTrailingZeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "5120300";
		
		StringBuilder sb = new StringBuilder(s);
		int n= sb.length();
		for(int i=0;i<n;i++) {
			if(sb.charAt(n-1)=='0') {
				sb.deleteCharAt(n-1);
				n--;
			}
			
		}
		System.out.println(sb);

	}

}
