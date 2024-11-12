package streamMethods;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class AllMatch {

	public static void main(String[] args) {
	    List<Integer> list = Arrays.asList(3, 4, 6, 12, 20);
	    
	    boolean allMatch = list.stream().allMatch(n -> n%3==0);
	    System.out.println(allMatch);
	    
	    System.out.println("**************");
	    
	    Stream<String> stream = Stream.of("Geeks", "for", 
                "GeeksQuiz", "GeeksforGeeks");
	    boolean allMatch2 = stream.allMatch(s -> s.contains("Geeks"));
	    System.out.println(allMatch2);
	    
	    
	}
}
