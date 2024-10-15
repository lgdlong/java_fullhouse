package Bai_1_19;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Sample array of strings for searching
        String[] wordsArray = {"hello", "world", "csharp", "java", "unity"};

        // Test linear search with two different target strings
        System.out.println("Linear search results:");
        performLinearSearch(wordsArray, "java");
        performLinearSearch(wordsArray, "godot");

        // Test binary search with two different target strings
        System.out.println("\nBinary search results:");
        performBinarySearch(wordsArray, "unity");
        performBinarySearch(wordsArray, "abc");

        sc.close();
    }

    /**
     * Performs a linear search on the array and prints the result index or -1 if not found.
     *
     * @param arr    The array of strings to search.
     * @param target The string to search for using linear search.
     */
    private static void performLinearSearch(String[] arr, String target) {
        int result = Search.linearSearch(arr, target);
        System.out.println("Linear search for \"" + target + "\": " + result);
    }

    /**
     * Performs a binary search on the array and prints the result index or -1 if not found.
     *
     * @param arr    The array of strings to search (which will be sorted internally).
     * @param target The string to search for using binary search.
     */
    private static void performBinarySearch(String[] arr, String target) {
        int result = Search.binarySearch(arr, target);
        System.out.println("Binary search for \"" + target + "\": " + result);
    }
}
