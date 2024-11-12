package streamMethods;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Map {

	public static void main(String[] args) {

		/*
		 * Stream map() function with operation of converting lowercase to uppercase.
		 */
		List<String> list = Arrays.asList("geeks", "gfg", "g", "e", "e", "k", "s");

		List<String> collect = list.stream().map(String::toUpperCase).collect(Collectors.toList());
		System.out.println(collect);

		/*
		 * Stream map() function with operation of mapping string length in place of
		 * string.
		 */
		List<String> list1 = Arrays.asList("Geeks", "FOR", "GEEKSQUIZ", "Computer", "Science", "gfg");
		List<Integer> collect2 = list1.stream().map(s -> s.length()).collect(Collectors.toList());
		System.out.println(collect2);

	}

}
