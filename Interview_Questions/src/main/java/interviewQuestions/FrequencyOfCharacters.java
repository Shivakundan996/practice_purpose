package interviewQuestions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfCharacters {
	/*
	 * program to find the frequency of characters
	 * 
	 * String s ="abbcc"
	 * 
	 * output: a=1,b=2,c=3
	 */

	public static void main(String[] args) {
		String s = "abbcc";
		int n = s.length();
		int j = 0;
		HashMap<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < n ; i++) {
			if (map.containsKey(s.charAt(i)))
				map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
			else
				map.put(s.charAt(i), 1);
		}

		System.out.println(map);
		System.out.println(map.get('b'));

		System.out.println(frequency());

	}
	

	private static Map<String, Long> frequency() {
		List<String> list = Arrays.asList("a","b","c","c");
		Map<String, Long> collect = list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		return collect;
		
	}
}
