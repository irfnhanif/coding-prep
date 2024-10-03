import java.util.Arrays;
import java.util.HashMap;

public class EasyValidAnagram {
   public static void main(String[] args) {
       System.out.println(isAnagram("car", "rat"));
   }

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();

        Arrays.sort(sArr);
        Arrays.sort(tArr);

        if (!Arrays.equals(sArr, tArr)) {
            return false;
        }

        return true;
    }
}