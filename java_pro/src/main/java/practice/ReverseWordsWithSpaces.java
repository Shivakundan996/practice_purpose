package practice;

public class ReverseWordsWithSpaces {

    public static void main(String[] args) {
        String input = "i am software engg";
        String output = reverseWordsWithSpaces(input);
        System.out.println(output); // Output: "g ma erawtfos gnE"
    }

    public static String reverseWordsWithSpaces(String str) {
        int n = str.length();
        char[] result = new char[n];

        // Step 1: Extract non-space characters and reverse them
        StringBuilder nonSpaceChars = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (str.charAt(i) != ' ') {
                nonSpaceChars.append(str.charAt(i));
            }
        }
        nonSpaceChars.reverse();

        // Step 2: Re-insert reversed characters into the result array, keeping spaces in their original positions
        int index = 0;
        for (int i = 0; i < n; i++) {
            if (str.charAt(i) == ' ') {
                result[i] = ' ';
            } else {
                result[i] = nonSpaceChars.charAt(index);
                index++;
            }
        }

        return new String(result);
    }
}

