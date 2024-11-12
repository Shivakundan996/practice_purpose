package interview;

public class FindUnique_VERYIMP {
    public static int findUnique(int[] arr) {
        int res = 0;
        for(int i =0;i<arr.length;i++){
            res = res ^ arr[i];
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 6, 3, 6, 2};
        System.out.println(findUnique(arr));
        System.out.println(1^2);
    }
}
