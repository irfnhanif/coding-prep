import java.util.Arrays;

public class EasyFindPivotIndex {
    public static void main(String[] args) {
        System.out.println(pivotIndex(new int[]{1,7,3,6,5,6}));
        System.out.println(pivotIndex(new int[]{1,2,3}));
    }

    public static int pivotIndex(int[] nums) {
        int[] leftSums = new int[nums.length];
        int[] rightSums = new int[nums.length];
        leftSums[0] = nums[0];
        rightSums[nums.length - 1] = nums[nums.length - 1];
        for (int i = 1, j = nums.length - 2; i < nums.length && j >= 0 ; i++, j--) {
            leftSums[i] = leftSums[i-1] + nums[i];
            rightSums[j] = rightSums[j+1] + nums[j];
        }
        for (int i = 0; i < nums.length; i++) {
            if (leftSums[i] == rightSums[i]){
                return i;
            }
        }

        return -1;
    }
}