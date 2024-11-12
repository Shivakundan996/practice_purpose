package interview;

public class Duplicates {

        public static int numIdenticalPairs(int[] nums) {
            int[] frequency = new int[5];
            int count = 0;
            for (int num : nums) {
                count += frequency[num];
                frequency[num]++;
            }
            return count;
        }

    public static void main(String[] args) {
        System.out.println(numIdenticalPairs(new int[]{1,2,3,1,1,3}));
    }
    }

