package interviewQuestions;

public class RemoveCharacterFromString {
	/*
	 * remove  a particular charcter from String i.e String s = "CloudTech"
	 */

	public static void main(String[] args) {
		String str = "CloudTech";

		// 1st type
		String replaceAll = str.replaceAll("C", "");
		System.out.println(replaceAll);

		// 2nd type
		removeChar(str, 'C');

	}

	private static void removeChar(String str, char c) {
		int n = str.length();
		String s = "";

		for (int i = 0; i < n; i++) {
			if (str.charAt(i) != c) {
				s = s + str.charAt(i);
			}
		}
		System.out.println(s.toUpperCase());

	}

}
