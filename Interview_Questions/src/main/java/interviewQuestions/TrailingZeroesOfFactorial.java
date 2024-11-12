package interviewQuestions;

/*
 * to reduce the time complexiyt for factorial program this is used
 */
public class TrailingZeroesOfFactorial {

	static int fact(int n) {
		int res = 0;
		int powOf5 = 5;
		while (n >= powOf5) {
			res = res + n / powOf5; // n/5 + n/25 + n/125 + n/625
			powOf5 = powOf5 * 5;
		}
		return res;
	}

	public static void main(String[] args) {
		System.out.println(fact(50));
	}
}
