package interviewQuestions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class RemoveDuplicatesUsingStream {

	public static void main(String[] args) {
		int[] a = { 1, 2, 1, 4, 5, 5 };
		Set<Integer> set = new HashSet<>();
		for (int i = 0; i < a.length; i++) {
			if (!set.add(a[i])) {
				set.add(a[i]);
			}
		}
		System.out.println(set);
		
		List<Integer> list =Arrays.asList(2,3,2,3,4,5);
		Set<Integer> set1 = new HashSet<>(list);
//		List<Integer> collect = list.stream().filter(x->set1.add(x)).collect(Collectors.toList());
		System.out.println(set1);
		
		
		/*
		 *using distinct() method
		 */
		List<Integer> list1 =Arrays.asList(2,3,2,3,4,5);
		List<Integer> collect2 = list1.stream().distinct().collect(Collectors.toList());
		System.out.println(collect2);
		
		

	}

}
