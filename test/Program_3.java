import java.util.Scanner;
/* CHECK PRIME NUMBER */
public class Program_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        double n = sc.nextDouble();

        if (n <= 0) { // Check input n >= 0
            System.out.println("Invalid number");
        }
        else {
            if (isPrime(n)) System.out.println("This is a prime number");
            else System.out.println("This is not a prime number");
        }
    }
    public static boolean isPrime(double n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
