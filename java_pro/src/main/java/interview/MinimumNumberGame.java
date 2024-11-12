package interview;

import java.util.Arrays;

public class MinimumNumberGame {
    public static void main(String[] args) {
        int[] nums = {5, 4, 2, 3};
        System.out.println(Arrays.toString((numberGame(nums))));
    }

    private static int[] numberGame(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int[] arr = new int[n];
        for (int i = 0; i < n; i = i + 2) {
            arr[i] = nums[i + 1];
            arr[i + 1] = nums[i];
        }
        return arr;
    }
}
