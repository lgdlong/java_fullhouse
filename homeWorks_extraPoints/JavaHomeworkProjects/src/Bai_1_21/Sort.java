package Bai_1_21;

public class Sort {
    /**
     * Sorts an array of strings using the bubble sort algorithm. The sorting
     * is case-insensitive, meaning that the comparison between strings does not
     * consider differences in case (i.e., "A" is considered equal to "a"). <br/>
     *
     * The algorithm repeatedly steps through the list, compares adjacent elements,
     * and swaps them if they are in the wrong order. This process is repeated
     * until the array is sorted.
     *
     * @param arr The array of strings to be sorted.
     */
    public static void bubbleSort(String ...arr) {
        int length = arr.length;
        boolean swapped;

        for (int i = 0; i < length; i++) {
            swapped = false;

            for (int j = 0; j < length - i -1; j++) {
                if (arr[j].compareToIgnoreCase(arr[j + 1]) > 0) {

                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    swapped = true;  // Indicate that a swap has occurred

                }
            }

            // If no elements were swapped, the array is already sorted
            if (!swapped) {
                break;
            }
        }
    }
}
