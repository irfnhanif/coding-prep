import java.util.ArrayList;
import java.util.Arrays;

public class EasyLongestCommonPrefix {
    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[]{"flower","flower","flower"}));
    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        String prefix = "";
        int idx = 0;
        int x = 0;
        String c = "";
        int minLength = Arrays.stream(strs).mapToInt(String::length).min().orElse(0);

        while (c != "-1" && x < minLength) {
            if (strs[idx].equals("")) {
                return prefix;
            }

            if (strs.length < 2) {
                return prefix + strs[0];
            }

            if (idx == 0) {
                if (strs[idx].length() >= x + 1) {
                    c = strs[idx].substring(0, x + 1);
                } else {
                    c = "-1";
                }
                idx++;
            }

            if (strs[idx].length() >= x + 1 && strs[idx].substring(0, x + 1).equals(c)) {
                if (idx == strs.length - 1) {
                    prefix += c.substring(c.length() - 1);
                    idx = 0;
                    x++;
                } else {
                    idx++;
                }
            } else {
                c = "-1";
            }
        }

        return prefix;
    }
}