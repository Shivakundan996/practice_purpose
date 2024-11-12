package streamMethods;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MinAndMax {

	public static void main(String[] args) {

		/*
		 * The Java Stream min() method is a terminal operation that returns the
		 * smallest element in the Stream.
		 */
		List<Integer> list = Arrays.asList(-9, -18, 0, 25, 4);
		
		//1st type
		Optional<Integer> min = list.stream().min(Integer::compare);
		
		//2nd type of finding min using compareTo
		Optional<Integer> min2 = list.stream().min((a1,a2)->{
			return a1.compareTo(a2);
					});
		
		System.out.println(min2);

		
		/*
		 * The Java Stream max() method is a terminal operation that returns the largest
		 * element in the Stream.
		 */
		List<Integer> list1 = Arrays.asList(-9, -18, 0, 25, 4);
		Optional<Integer> max = list1.stream().max(Integer::compare);
		System.out.println(max);
		System.out.println(max.get());


	}

}
