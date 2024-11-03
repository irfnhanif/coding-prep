import java.security.Key;
import java.util.*;

public class EasySortThePeople {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortPeople(new String[]{"Mary","John","Emma"}, new int[]{180,165,170})));
    }

    public static String[] sortPeople(String[] names, int[] heights) {
        String[] result = new String[names.length];
        TreeMap<Integer, String> map = new TreeMap<>();
        for (int i = 0; i < names.length; i++) {
            map.put(heights[i], names[i]);
        }
        for (int j = 0; j < names.length; j++) {
            Map.Entry<Integer, String> entry = map.pollLastEntry();
            result[j] = entry.getValue();
        }
        return result;
    }
}