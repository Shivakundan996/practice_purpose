package array_string;

import java.util.Arrays;

public class FlowerBed {
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {

        int m = flowerbed.length;
        for (int i = 2; i < m; i++) {
            if (i % 2 == 0) {
                flowerbed[i] = n--;
                if (n == 0) {
                    break;
                }
            }

        }
        System.out.println(Arrays.toString(flowerbed));
        if ((flowerbed[m - 1] >= 1) && (flowerbed[m - 2] >= 1)) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] flowerbed = {1,0,0,0,1};
        int n = 2;

        System.out.println(canPlaceFlowers(flowerbed, n));
    }
}
