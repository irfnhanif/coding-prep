import java.util.Arrays;

public class EasyReplaceElementsWithGreatestElementOnRightSide {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(replaceElements(new int[]{17,18,5,4,6,1})));
    }

    public static int[] replaceElements(int[] arr) {
        int max = -1;
        for (int i = arr.length - 1; i >= 0; i--) {
            int temp = arr[i];
            arr[i] = max;
            if (temp > max) {
                max = temp;
            }
        }

        return arr;
    }
}