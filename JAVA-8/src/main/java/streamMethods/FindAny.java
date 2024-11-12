package streamMethods;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindAny {
	public static void main(String[] args) {
		/*
		 * The Java Stream findAny() method can find a single element from the Stream.
		 * The element found can be from anywhere in the Stream.
		 */
		List<String> list = Arrays.asList("Geeks", "for", "GeeksQuiz", "GFG");
		Optional<String> findAny = list.stream().findAny();
		System.out.println(findAny.isPresent());
		System.out.println(findAny.get());
	}
}
