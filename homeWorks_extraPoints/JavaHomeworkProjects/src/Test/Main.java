package Test;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 5, 6, 8, 9, 12, 17, 20, 26};
        int x = 3;

        int pos = binarySearch(x, arr);
        System.out.println(pos);
    }

    public static int binarySearch(int x, int  ...arr) {
        int location;

        int i = 1;
        int j = arr.length;

        int m;

        while (i < j) {
            m = (int) Math.floor((i + j)*1.0 / 2);

            if (x > arr[m]) {
                i = m + 1;
            } else {
                j = m;
            }
        }
        if (x == arr[i]) {
            location = i;
        }
        else {
            location = 0;
        }
        return location;
    }
}