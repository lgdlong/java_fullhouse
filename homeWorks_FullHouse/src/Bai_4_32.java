import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Bai_4_32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, res;
        n = sc.nextInt();

        int[] arr = {1, 2, 3};

        ArrayList<Integer> digitsList = new ArrayList<>();
        toDigitsList(digitsList, n);

        int sumAllDigits = digitsList.stream().mapToInt(Integer::intValue).sum();

        if (sumAllDigits % 3 == 0) {

        }


        sc.close();
    }
    public static void toDigitsList(ArrayList<Integer> arr, int n) {
        int temp;
        while (n != 0) {
          arr.add(n % 10);
          n /= 10;
      }
    }
}
