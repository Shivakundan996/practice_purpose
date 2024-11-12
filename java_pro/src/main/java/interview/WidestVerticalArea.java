package interview;

import java.util.Arrays;

public class WidestVerticalArea {

    public static int maxWidthOfVerticalArea(int[][] points){
        int n=points.length;
        int[] a= new int[n];
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(j==0){
                    a[count++]=points[i][j];
                }
            }
        }
        Arrays.sort(a);
        int diff = 0;
        int max=0;
        for(int i=1;i<n;i++){
            diff=a[i]-a[i-1];
            max = Math.max(diff,max);
        }

        return max;

    }

    public static void main(String[] args) {
        int[][] points = {{8,7},{9,9},{7,4},{9,7}};
        System.out.println(maxWidthOfVerticalArea(points));
    }
}
