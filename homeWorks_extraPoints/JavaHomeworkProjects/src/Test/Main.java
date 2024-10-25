package Test;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Integer[] arr = new Integer[]{1, 3, 5, 7, 2, 4, 6, 8, 5, 6, 7};

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(arr));
        HashSet<Integer> hashSet = new HashSet<>(list);
        TreeSet<Integer> treeSet = new TreeSet<>(list);

        System.out.println(hashSet);
        System.out.println(treeSet);


    }
}