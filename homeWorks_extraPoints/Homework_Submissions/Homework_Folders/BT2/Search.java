package Bai_1_19;

public class Search {

    /**
     * Performs a linear search to find the index of a target string in the array.
     *
     * @param arr    The array of strings to search.
     * @param target The target string to find in the array.
     * @return       The index of the target string in the array, or -1 if not found.
     */
    public static int linearSearch(String[] arr, String target) {
        for (int i = 0; i < arr.length; i++) {
            if (target.equals(arr[i])) {
                return i;
            }
        }
        return -1;
    }


    /**
     * Performs a binary search to find the index of a target string within an array.
     * It clones and sorts the input array using bubble sort, then applies binary search.
     *
     * @param arr    The input array of strings. The original array is not modified.
     * @param target The target string to search for.
     * @return       The index of the target string in the sorted array, or -1 if not found.
     *
     * Note: The input array is cloned and sorted internally, so the original order of the array is preserved.
     */
    public static int binarySearch(String[] arr, String target) {
        String[] sortedArr = arr.clone(); // Should not modify the original -> Create a clone

        Sort.bubbleSort(sortedArr);

        int left = 0, right = sortedArr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            int comparison = target.compareTo(sortedArr[mid]);
            if (comparison < 0) {
                right = mid - 1;
            } else if (comparison > 0) {
                left = mid + 1;
            } else {
                return mid; // Target found, return the index mid
            }
        }
        return -1; // Target not found, return -1
    }
}
