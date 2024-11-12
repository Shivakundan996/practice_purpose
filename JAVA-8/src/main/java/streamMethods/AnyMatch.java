package streamMethods;

import java.util.Arrays;
import java.util.List;

public class AnyMatch {

	public static void main(String[] args) {
	    List<Integer> list = Arrays.asList(3, 4, 6, 12, 20); 

	    boolean anyMatch = list.stream().anyMatch(x -> (x*(x+1)/4)==5);
	    System.out.println(anyMatch);
	}
}
