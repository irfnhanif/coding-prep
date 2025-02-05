import java.util.HashMap;

public class EasyJewelsAndStones {
    public static void main(String[] args) {
        System.out.println(numJewelsInStones("aA", "aAAbbbb"));
    }

    public static int numJewelsInStones(String jewels, String stones) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char jewel: jewels.toCharArray()) {
            map.put(jewel, 0);
        }
        int count = 0;
        for (char stone: stones.toCharArray()) {
            if (map.containsKey(stone)) {
                count++;
            }
        }

        return count;
    }
}