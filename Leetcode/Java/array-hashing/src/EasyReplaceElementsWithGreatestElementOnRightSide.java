import java.util.Arrays;

public class EasyReplaceElementsWithGreatestElementOnRightSide {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(replaceElements(new int[]{17,18,5,4,6,1})));
    }

    public static int[] replaceElements(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int highest = 0;
            for (int j = i+1; j < arr.length ; j++) {
                if (arr[j] > highest) {
                    highest = arr[j];
                }
            }
            arr[i] = highest;
        }
        arr[arr.length - 1] = -1;

        return arr;
    }
}