package practice.purpose;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DataTypeDemo {
	
	static int i;
	static boolean b;
	public static void main(String[] args) {
		System.out.println(i+" "+b);
		List<Integer> list = Arrays.asList(1,2,3,3,5,6);
		List<Integer> collect = list.stream().distinct().collect(Collectors.toList());
		
		
	}

}
