package optionalClass;

import java.util.Optional;


/**
 * Optional.ofNullable() - The ofNullable() static method returns an Optional describing the specified value,
 *  if non-null, otherwise returns an empty Optional.
 *  
 * Optional.of() - The of() static method returns an Optional with the specified present non-null value.
 * 
 * .empty() - To create an empty Optional object, we simply need to use its empty() static method:
 * 
 * .get()
 * 
 * .isPresent()
 * 
 * .ifPresent()
 * 
 * .orElse()
 * 
 * .orElseGet()
 * 
 * .orElseThrow()
 * 
 * */

public class OptionalBasicExample {
	public static void main(String[] args) {
		
		Optional<String> gender = Optional.of("male");
		String answer1 = "Yes";
	    String answer2 = null;
	    
	    System.out.println(gender);
	    System.out.println(gender.get());
        System.out.println("Empty Optional: " + Optional.empty());

        
        System.out.println("\nofNullable on Non-Empty Optional: " + Optional.ofNullable(answer1));
        System.out.println("ofNullable on Empty Optional: " + Optional.ofNullable(answer2));
	      
     // java.lang.NullPointerException
//        System.out.println("\n ofNullable on Non-Empty Optional: " + Optional.of(answer2));
        
        
        
       
	}

}
