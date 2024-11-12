package patternPrograms;

public class RightAngleTri {
	public static void main(String[] args) {
		pattern1();
		pattern2(4);
		pattern3(5);
		pattern4(4);
		pattern5(5);
		pattern6(5);
		pattern7(5);
		pattern8(5);

	}

	public static void pattern1() {
		int row = 4;
		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	static void pattern2(int n) {
		System.out.println("---------------");
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.print("* ");

			}
			System.out.println();
		}
	}

	private static void pattern3(int n) {
		System.out.println("----------------");
		for (int i = n; i >= 1; i--) {
			for (int j = i - 1; j >= 1; j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	private static void pattern4(int n) {
		System.out.println("---------------");
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j < n + 1 - i; j++) {
				System.out.print("* ");

			}
			System.out.println();
		}

	}

	private static void pattern5(int n) {
		System.out.println("---------------");
		for (int i = 1; i <= n; i++) { // i is for number of rows
			for (int j = 1; j <= i; j++) { // row = colums
				System.out.print(j + " ");
			}
			System.out.println();
		}

	}

	private static void pattern6(int n) {
		// TODO Auto-generated method stub
		System.out.println("---------------");

		for (int i = 0; i < 2 * n; i++) {
			if (i < n) {
				for (int j = 0; j < i; j++) {
					System.out.print("* ");
				}
			} else {
				for (int j = 0; j < (2 * n - i); j++) {
					System.out.print("* ");
				}
			}
			System.out.println();
		}

	}

	private static void pattern7(int n) {
		System.out.println("---------");

		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}

			for (int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}

	}

	private static void pattern8(int n) {
		System.out.println("---------");

		for (int i = 0; i <= n; i++) {
			for (int j = n - i; j > 1; j--) {

				System.out.print(" ");
			}

			for (int k = 0; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
