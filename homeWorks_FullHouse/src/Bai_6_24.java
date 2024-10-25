import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Bai_6_24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        ArrayList<String> arr = new ArrayList<>();
        // Input data
        for (int i = 1; i <= n; i++) {
            String input = sc.nextLine().trim();
            arr.add(input);
        }
    }
    public static int countZerosToDelete(String input) {

        int i = 0, j = 1; // Set index

        char currentChar = input.charAt(i);
        char nextChar = input.charAt(j);

        int count = 0;


        while (currentChar == '0') {
            while (nextChar != '1') {
                nextChar = input.charAt(i++);
                count++;
            }


        }


        return 0;
    }
}
