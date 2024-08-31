import java.util.Scanner;

public class Bai_5_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 2; i < n; i++) {
            if (checkPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }
    public static boolean checkPrime(int n) {
        // Handle small numbers
        if (n <= 1) return false;
        if (n <= 3) return true;  // 2 and 3 are prime

        // Eliminate multiples of 2 and 3
        if (n % 2 == 0 || n % 3 == 0) return false;

        // Check divisibility up to √n
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }

        return true;
    }
}
