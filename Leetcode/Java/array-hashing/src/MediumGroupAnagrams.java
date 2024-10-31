import java.util.*;

public class MediumGroupAnagrams {
    public static void main(String[] args) {
        System.out.println(groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"}));
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> ga = new HashMap<String, List<String>>();
        for (String str: strs) {
            char[] cs = str.toCharArray();
            Arrays.sort(cs);
            String scs = new String(cs);
            if (ga.containsKey(scs)) {
                ga.get(scs).add(str);
            } else {
                ga.put(scs, new ArrayList<String>(Collections.singletonList(str)));
            }
        }
        return new ArrayList<>(ga.values());
    }
}