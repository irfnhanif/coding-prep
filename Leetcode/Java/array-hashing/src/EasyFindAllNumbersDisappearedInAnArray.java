import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EasyFindAllNumbersDisappearedInAnArray {
    public static void main(String[] args) {
        System.out.println(findDisappearedNumbers(new int[]{1,1}));
    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int idx = Math.abs(nums[i]);
            if (nums[idx - 1] > 0) {
                nums[idx - 1] *= -1;
            }
        }
        List<Integer> missingNums = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0 ) {
                missingNums.add(i+1);
            }
        }
        return missingNums;
    }

}