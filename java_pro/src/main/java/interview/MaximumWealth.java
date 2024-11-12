package interview;

public class MaximumWealth {
    public int maximumWealth(int[][] accounts) {
        int sum = 0;
        int[] sums = new int[accounts.length];
        for (int i = 0; i < accounts.length; i++) {
            for (int j = 0; j < accounts[i].length; j++) {
                sum = sum + accounts[i][j];

            }
            sums[i]=sum;
            sum=0;
        }
        int max=0;
        for(int i=0;i<sums.length;i++){
            max = Math.max(max,sums[i]);
        }
        return max;
    }

    public static void main(String[] args) {
        MaximumWealth maximumWealth =new MaximumWealth();
        int[][] accounts ={{1,2,3},{3,2,1}};
        System.out.println(maximumWealth.maximumWealth(accounts));
    }
}
