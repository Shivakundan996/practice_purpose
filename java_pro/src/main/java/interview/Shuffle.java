package interview;

import java.util.Arrays;

public class Shuffle {
    public static String shuffle(int[] nums, int n) {

        int[] b = new int[2 * n];
        for (int i = 0; i <  n; i++) {
            b[2 * i] = nums[i];
            b[2 * i + 1] = nums[i + n];

        }
        return Arrays.toString(b);
    }

    public static void main(String[] args) {
        int[] nums={2,5,1,3,4,7};
        int n=3;
        System.out.println();
        System.out.println(shuffle(nums,n));
    }
}
