package interview;

import java.util.Arrays;

public class MaxSubarraySum {

    public static long maxSubarraySum(int[] arr, int n) {
        // write your code here
        int max=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(j==i){
                    continue;
                }
                max=Math.max(max,arr[i]+arr[j]);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {10 ,20, -30, 40, -50, 60};
        int n = arr.length;
        System.out.println(maxSubarraySum(arr,n));
    }
}
