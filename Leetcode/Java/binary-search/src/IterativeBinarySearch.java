public class IterativeBinarySearch {
    public static int iterativeBinarySearch(int[] array, int value) {
        int low = 0;
        int high = array.length - 1;
        while (low <= high) {
            int middle = low + (high - low) / 2;

            if (array[middle] == value ) {
                return array[middle];
            }

            if (array[middle] < value) {
                low = middle + 1;
            } else {
                high = middle - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        System.out.println(iterativeBinarySearch(new int[]{2,7,14,17,25,49,63,69,78,82,85,94,100}, 99));
    }

}
