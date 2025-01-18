import java.util.*;

public class EasySumOfUniqueElements {
    public static void main(String[] args) {
        System.out.println(sumOfUnique(new int[]{1,1,1,1,1}));
    }

    public static int sumOfUnique(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int n: nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        int sum = 0;
        for (int n: nums) {
            if (map.get(n) == 1) {
                sum += n;
            }
        }

        return sum;
    }
}