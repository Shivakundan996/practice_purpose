package practice.purpose;

import java.util.Optional;

public class OptionalDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Optional<String> ofNullable = Optional.ofNullable(null);
		String orElse = ofNullable.orElse("String");
		System.out.println(orElse);
		
		System.out.println(orElse.equals("String"));
		
		
		if(ofNullable.isPresent()) {
			System.out.println("value is there"+orElse);
		}else {
			System.out.println("value is not there");

		}

	}

}
