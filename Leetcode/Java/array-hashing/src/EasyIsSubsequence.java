public class EasyIsSubsequence {
    public static void main(String[] args) {
        System.out.println(isSubsequence("ac", "abc"));
    }

    public static boolean isSubsequence(String s, String t) {
        int sp = 0;
        int tp = 0;

        while (sp < s.length() && tp < t.length()) {
            if (s.charAt(sp) == t.charAt(tp)){
                sp++;
            }
            tp++;
        }

        return sp == s.length();
    }
}