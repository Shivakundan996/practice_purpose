package interviewQuestions;

public class StringProb {

	public static void main(String[] args) {
		String s1 = new String("abc");
		String s2 = new String("abc");
		System.out.println(s1 == s2); // false (here == opeartor checks the memory area of s1 and s2 as they have diff
										// memory area)
		System.out.println(s1.equals(s2)); // true (here beacuse of eqauls method values are compared,so true)

		String s3 = new String("Hello");
		String s4 = new String("Hello");
		System.out.println(s3 == s4);

	}

}
