package lambdaExperssion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
 *Java Lambda Expression Example: Comparator
 **/
public class JLEComparatorExample {
	
	private static List<Person> collect;
	

	public static void main(String[] args) {
	   List<Person> listOfPerson = new ArrayList<Person>();
	   listOfPerson.add(new Person("abc", 27));
       listOfPerson.add(new Person("mno", 26));
       listOfPerson.add(new Person("pqr", 28));
       listOfPerson.add(new Person("xyz", 25));
	   
       //using stream() sorting by age
       collect = listOfPerson.stream()
    		   .sorted(Comparator.comparing(Person::getAge))//.map(p->p.getAge())
    		   .collect(Collectors.toList());       
       collect.forEach(System.out::println);
       
    // With lambda expression.
       // Sort list by age in desecending order
       //o2-o1 -desc
       //o1-o2 -asec
       Collections.sort(listOfPerson, ((Person o1, Person o2) -> {
           return o2.getAge() - o1.getAge();
       }));
       
       
       //without using lambda
       //sorting list by age of person
       Collections.sort(listOfPerson, Comparator.comparing(Person::getAge));
       
       
       // Use forEach method added in java 8
       System.out.println(" sort persons by age in ascending order");
       
       listOfPerson.forEach(
          (person) -> {
        	  System.out.println(" Person name : " + person.getAge());
        	  });
	}
}
