package streamMethods;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class NoneMatch {

	public static void main(String[] args) {
		Stream<String> stream = Stream.of("CSE", "C++", "Java", "DS");
		boolean noneMatch = stream.noneMatch(s -> s.length() > 3);
		System.out.println(noneMatch);

		System.out.println("*********");

		List<Integer> list = Arrays.asList(4, 0, 6, 2);
		System.out.println(list.stream().noneMatch(n -> n > 0));

	}
}
