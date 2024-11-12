package streamMethods;

import java.util.Arrays;
import java.util.stream.Stream;

//Creating Stream object from Arrays
//Array can be a source of a Stream or Array can be created from the existing array or of a part of an array:

public class StreamCreationExamples2 {
	public static void main(String[] args) {
		
		// Array can also be a source of a Stream
		Stream<String> streamOfArray = Stream.of("a","b","c");
		streamOfArray.forEach(s-> System.out.print(s+" "));
		
		// creating from existing array or of a part of an array:
		String[] arr =new String[] {"java","j2ee","spring"};	
		Stream<String> s = Arrays.stream(arr);
		System.out.println();
		s.forEach(System.out::println);
		
		
	}

	
}
