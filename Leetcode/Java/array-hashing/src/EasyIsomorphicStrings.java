import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class EasyIsomorphicStrings {
    public static void main(String[] args) {
        System.out.println(isIsomorphic("badc", "baba"));
    }

    public static boolean isIsomorphic(String s, String t) {
        Map<Character, Character> iso = new HashMap<>();
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();
        for (int i = 0; i < sArr.length; i++) {
            if (!iso.containsKey(sArr[i])) {
                if (iso.containsValue(tArr[i])) {
                    return false;
                } else {
                    iso.put(sArr[i], tArr[i]);
                }
            } else {
                if (iso.get(sArr[i]) != tArr[i]) {
                    return false;
                }
            }
        }
        return true;
    }
}