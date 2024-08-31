import java.util.ArrayList;
import java.util.Scanner;

public class Bai_4_23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 1; i <= n; i++) arr.add(i);

        int last = n - 1;
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    if (i != j && j != k && k != i) {
                        System.out.print("" + arr.get(i) + arr.get(j) + arr.get(k) + " ");
                        count++;
                    }
                }
            }
        }
        System.out.println();
        System.out.print(count);
    }
}
