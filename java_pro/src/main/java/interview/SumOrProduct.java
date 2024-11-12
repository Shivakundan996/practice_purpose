package interview;

public class SumOrProduct {

    public static long sumOrProduct(int n, int q) {
        long resultadd = 0;
        long resultmul = 1;

        if (q == 1) {
            for (int i = 1; i <= n; i++) {
                resultadd = resultadd + i;
            }
            return resultadd;
        } else {
            for (int i = 1; i <= n; i++) {
                resultmul = resultmul * i;
            }
        }
        return resultmul;

    }

    public static void main(String[] args) {
        int q = 2, n = 15;
        System.out.println(sumOrProduct(n, q));
    }
}


