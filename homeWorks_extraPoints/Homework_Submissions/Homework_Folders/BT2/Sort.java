package Bai_1_19;

public class Sort {

    /**
     * Sorts an array of strings using bubble sort. The array is sorted in lexicographical order.
     *
     * @param arr The array of strings to be sorted. This method modifies the original array in place.
     */
    public static void bubbleSort(String... arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    swap(arr, j, j + 1);  // Swap the adjacent strings
                }
            }
        }
    }

    /**
     * Sorts an array of integers using bubble sort. The array is sorted in ascending order.
     *
     * @param arr The array of integers to be sorted. This method modifies the original array in place.
     */
    public static void bubbleSort(int... arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);  // Swap the adjacent integers
                }
            }
        }
    }

    /**
     * A helper method to swap two elements in a string array.
     *
     * @param arr The array of strings where the swap will happen.
     * @param i   The index of the first element.
     * @param j   The index of the second element.
     */
    private static void swap(String[] arr, int i, int j) {
        String temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    /**
     * A helper method to swap two elements in an integer array.
     *
     * @param arr The array of integers where the swap will happen.
     * @param i   The index of the first element.
     * @param j   The index of the second element.
     */
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
