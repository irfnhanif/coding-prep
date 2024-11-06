public class RecursiveBinarySearch {
    public static int recursiveBinarySearch(int[] array, int low, int high, int value){
        if (low <= high) {
            int middle = low + (high - low) / 2;

            if (array[middle] == value) {
                return array[middle];
            }

            if (array[middle] < value) {
                return recursiveBinarySearch(array, middle + 1, high, value);
            }

            return recursiveBinarySearch(array, low, middle - 1, value);
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{2,7,14,17,25,49,63,69,78,82,85,94,100};
        int arrLength = arr.length;
        System.out.println(recursiveBinarySearch(arr, 0, arrLength - 1, 69));
    }
}
