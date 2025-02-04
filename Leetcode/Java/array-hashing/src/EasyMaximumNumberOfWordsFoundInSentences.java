public class EasyMaximumNumberOfWordsFoundInSentences {
    public static void main(String[] args) {
        System.out.println(mostWordsFound(new String[]{"alice and bob love leetcode", "i think so too", "this is great thanks"}));
    }

    public static int mostWordsFound(String[] sentences) {
        int max = 0;
        for (String s: sentences) {
            String[] sArr = s.split(" ");
            max = sArr.length > max ? sArr.length : max;
        }

        return max;
    }
}