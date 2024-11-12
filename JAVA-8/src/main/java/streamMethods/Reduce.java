package streamMethods;

import java.util.Arrays;
import java.util.OptionalInt;

public class Reduce {

	/*
	 * In Java 8, the Stream.reduce() combine elements of a stream and produces a
	 * single value.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		// sum of all elements
		// 1st type
		OptionalInt reduce = Arrays.stream(numbers).reduce(Integer::sum);
		System.out.println(reduce.orElse(0));

		// 2nd type
		int sum = Arrays.stream(numbers).reduce(0, (a, b) -> a + b);
		System.out.println(sum);

		// max number
		int max = Arrays.stream(numbers).reduce(0, (a, b) -> a > b ? a : b);
		System.out.println(max);

		// min number
		int min = Arrays.stream(numbers).reduce(1, (a, b) -> a < b ? a : b); // 0
		System.out.println(min);

	}

}
