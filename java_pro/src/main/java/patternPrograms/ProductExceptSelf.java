package patternPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProductExceptSelf {
	public static void main(String[] args) {
		
		int[] a={1,2,3,4};
		int b[]=new int[a.length];
		int c[]=new int[a.length];
		int n=a.length-1;
		for(int i=0;i<n;i++) {
			
			if(i>a.length-1) {
				System.out.println();
			}else {
				b[i]=a[i]*a[++i];
				c[i]=b[i]*a[++i];
				
			}
			System.out.println(c[i]);
		}

		int integers[] = new int[3];
		List<Integer> integerList = new ArrayList<>();
//		System.out.println(integers[0]);
//		System.out.println(integerList.get(0));

		int d[] = {1, 2, 3};
		int e[] = {1, 2, 3};
		System.out.println(d == e);
		System.out.println(Arrays.equals(d, e));
		
	}

}
