import java.util.Scanner;

public class Bai_4_39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Triangle(n);
        sc.close();
    }

    public static void Triangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < n - i + 1; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }
            if (i != n) System.out.println();
        }
    }
}
