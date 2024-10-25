package Bai_1_21;

import java.util.Arrays;

public class Program extends Sort {

    public static void main(String[] args) {
        String[] arr = new String[] {"abc", "aa", "bc", "ac", "ba", "ca", "ab"};

        Sort.bubbleSort(arr);

        System.out.println(Arrays.toString(arr));
    }


}
