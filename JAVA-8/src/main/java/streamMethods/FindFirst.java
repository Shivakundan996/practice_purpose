package streamMethods;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindFirst {

	/*
	 * The Java Stream findFirst() method finds the first element in the Stream if
	 * any elements are present in the Stream
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = Arrays.asList(3, 5, 7, 9, 11);
		Optional<Integer> answer = list.stream().findFirst();
		if(answer.isPresent()) {
			System.out.println(answer.get());
		}else {
			System.out.println("no value");
		}

	}

}
