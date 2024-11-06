import java.util.Arrays;

public class EasyFindPivotIndex {
    public static void main(String[] args) {
        System.out.println(pivotIndex(new int[]{1,7,3,6,5,6}));
        System.out.println(pivotIndex(new int[]{1,2,3}));
    }

    public static int pivotIndex(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int leftSum = 0;
            int rightSum = 0;
            if (i != 0) {
                leftSum = Arrays.stream(Arrays.copyOfRange(nums,0, i)).sum();
            }
            System.out.println(leftSum);

            if (i != nums.length - 1) {
                rightSum = Arrays.stream(Arrays.copyOfRange(nums, i+1, nums.length)).sum();
            }
            System.out.println(rightSum);

            System.out.println("-");
            if (leftSum == rightSum) {
                return i;
            }
        }

        return -1;
    }
}