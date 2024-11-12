package interview;

public class MaximumNumberOfStringPairs {
    public static int maximumNumberOfStringPairs(String[] words) {
        int n = words.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                StringBuilder sb = new StringBuilder(words[j]);
                sb = sb.reverse();
                if (words[i].equals(sb.toString())) {
                    count++;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        String[] words = {"cd", "ac", "dc", "ca", "zz"};

        System.out.println(maximumNumberOfStringPairs(words));
    }
}
