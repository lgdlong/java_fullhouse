import java.util.Scanner;
// CHECK PERFECT NUMBER
public class Program_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        if (n < 0) { // Check input n >= 0
            System.out.println("Invalid number");
        }
        else {
        if (isPerfect(n)) System.out.println("This is a perfect number");
        else System.out.println("This is not a perfect number");
        }
    }

    public static boolean isPerfect(int n) {
        long sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) sum += i;
        }
        return sum == n;
    }
}
