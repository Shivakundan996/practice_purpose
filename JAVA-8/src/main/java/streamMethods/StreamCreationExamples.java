package streamMethods;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//A stream can be created of any type of Collection (Collection, List, Set):

public class StreamCreationExamples {
	
	public static void main(String[] args) {
		
		
		Collection<String> collection = Arrays.asList("java","j2ee","hibernate","spring");
		collection.stream().forEach(System.out::println);
		
		
		 List<String> list = Arrays.asList("JAVA", "J2EE", "Spring", "Hibernate");
	     list.stream().forEach(System.out::println);
	     
	     Set<String> set = new HashSet<>(list);
	     set.stream().forEach(System.out::println);
		
		
	}

}
