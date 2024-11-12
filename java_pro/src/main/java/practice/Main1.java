package practice;

import java.util.*;

public class Main1 {
    public static void main(String[] args) {
        int arr[] = {1, 2, 1, 3, 4, 2, 3};
        int K = 3;
        int N = arr.length;

        // Traverse through every window of size K
        for (int i = 0; i <= N - K; i++) {
            int dist_count = 0;
            int[] win = Arrays.copyOfRange(arr, i, i + K);

            // Traverse the window
            for (int j = 0; j < K; j++) {
                // Check if element win[j] exists in win[0..j-1]
                int l;
                for (l = 0; l < j; l++)
                    if (win[j] == win[l])
                        break;
                if (j == l)
                    dist_count++;
            }

            // Print count of distinct elements for this window
            System.out.println(dist_count);
        }
    }
}
