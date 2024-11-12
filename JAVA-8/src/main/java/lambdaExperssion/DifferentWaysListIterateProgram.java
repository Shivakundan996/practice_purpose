package lambdaExperssion;

import java.util.Arrays;
import java.util.List;


/**
 * Iterate ArrayList with forEach() method + Lambda Expression Example*/
public class DifferentWaysListIterateProgram {

	  public static void main(String...args) {
    List < String > courses = Arrays.asList("C", "C++", "Core Java", "J2EE", "Spring", "Hibernate", "Python");
    
    // JDK 8 streaming example lambda expression
    courses.stream().forEach(s -> printCourse(s));
    
    // JDK 8 streaming example method reference
    courses.stream().forEach(DifferentWaysListIterateProgram::printCourse);
    
    // JDK 8 for each with lambda
    courses.forEach(s -> printCourse(s));
    
    // JDK 8 for each
    courses.forEach(DifferentWaysListIterateProgram::printCourse);
    
    courses.forEach((s)->{
    System.out.println("jfa "+s);
    });
    
	  }
	  
	  
	  // common method to print course
	    private static void printCourse(String course) {
	        System.out.println("course name :: " + course);
	    }

}
