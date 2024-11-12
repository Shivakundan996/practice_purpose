package interview;

public class MostWordsFound {

    public int mostWordsFound(String[] sentences) {

        int max = 0;
        for (String sentence : sentences) {
            String[] words = sentence.split(" ");
            max = Math.max(max, words.length);
        }
        return max;
    }

    public static void main(String[] args) {
        String[] sentences = {"alice and bob love leetcode ", "i think so too", " is great thanks very much"};
        MostWordsFound found = new MostWordsFound();
        System.out.println(found.mostWordsFound(sentences));
    }
}
