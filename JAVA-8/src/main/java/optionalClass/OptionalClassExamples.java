package optionalClass;

import java.util.Optional;

public class OptionalClassExamples {

	
	public static void main(String[] args) {
        isPresentOptionalAPI();
    	System.out.println();

        createEmptyOptionalObject();
    	System.out.println();

        createEmptyOptionalObjectWithStaticAPI();
    	System.out.println();

        ifPresentOptionalAPI();
    	System.out.println();

        orElseOptionalAPI();
    	System.out.println();

        orElseOptionalAPI();
    	System.out.println();

        orElseGetOptionalAPI();
    	System.out.println();

        orElseThrowOptionalAPI();
    	System.out.println();

        getOptionalAPI();
    }

	// Returns an Optional with the specified present non-null value.
	private static void isPresentOptionalAPI() {
		// TODO Auto-generated method stub
		
		Optional<String> name = Optional.of("ShivaKundan");
		System.out.println(name.isPresent());
	}

	// Returns an Optional with the specified present non-null value.
	private static void createEmptyOptionalObject() {
		// TODO Auto-generated method stub
		
		Optional < String > empty = Optional.empty();
        System.out.println(empty.isPresent());
        
     // Optional object with the static of API:
        String name = "Ramesh";
        System.out.println(Optional.of(name));
	}

	private static void createEmptyOptionalObjectWithStaticAPI() {
		// TODO Auto-generated method stub
		
		String name = "baeldung";
        Optional.of(name);
	}

	// If a value is present, invoke the specified consumer with the value, otherwise do
	// nothing.
	private static void ifPresentOptionalAPI() {
		// TODO Auto-generated method stub
		
		 // The ifPresent API enables us to run some code on the wrapped value if it is
        // found to be non-null.
        // Before Optional, we would do something like this:
        String name = "Ramesh";
        if (name != null) {
            System.out.println(name.length());
        }
        
        Optional<String> names = Optional.of("Shiva");
        names.ifPresent(s ->System.out.println(names.get() +" name length is "+ s.length()));
        
        
	}

	
	// If a value is present, invoke the specified consumer with the value, otherwise do
	 // nothing.
	private static void orElseOptionalAPI() {
		// TODO Auto-generated method stub
		
		// With orElse, the wrapped value is returned if it is present and the argument
		   // given to
		  // orElse is returned if the wrapped value is absent
		String name = null;
		
		// If a value is present, invoke the specified consumer with the value, otherwise
	     // do nothing.
		System.out.println(Optional.ofNullable(name).orElse("Shiva is my name"));

	}

	
	private static void orElseGetOptionalAPI() {
		// TODO Auto-generated method stub
		String nullName = null;
        String name = Optional.ofNullable(nullName).orElseGet(() -> "Ramesh");
        System.out.println(name);
	}

	private static void orElseThrowOptionalAPI() {
		// TODO Auto-generated method stub
		String name = "jeeva";
		String name1 = Optional.ofNullable(name).orElseThrow(IllegalArgumentException::new);
		System.out.println(name1);
		System.out.println(Optional.ofNullable("shivani"));
	}


	private static void getOptionalAPI() {
		// TODO Auto-generated method stub
		Optional < String > opt = Optional.of("bava");
        String name = opt.get();
        System.out.println(opt);
        System.out.println(name);
	}
	
	
	
	
}
