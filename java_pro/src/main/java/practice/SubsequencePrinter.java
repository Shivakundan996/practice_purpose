package practice;

public class SubsequencePrinter {

    // Function to print all subsequences of a given string
    public static void printSubsequences(String str) {
        int n = str.length();
        int numOfSubsequences = 1 << n; // 2^n subsequences

        for (int i = 0; i < numOfSubsequences; i++) {
            StringBuilder subsequence = new StringBuilder();
            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) != 0) {
                    subsequence.append(str.charAt(j));
                }
            }
            System.out.println(subsequence.toString());
        }
    }

    public static void main(String[] args) {
        printSubsequences("ABCD");
    }
}
