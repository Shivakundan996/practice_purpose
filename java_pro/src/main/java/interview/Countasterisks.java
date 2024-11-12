package interview;
public class Countasterisks {

    public static int countAsterisks(String s) {
        String[] arr = s.split("[|]");
        int count = 0;
        for(int i=0;i< arr.length;i++){
            if((arr[i].indexOf("*"))==(arr[i].lastIndexOf("*"))){

            }
        }
        return count;
    }


    public static void main(String[] args) {
        String s = "iamprogrammer";
        System.out.println(countAsterisks(s));

    }
}

