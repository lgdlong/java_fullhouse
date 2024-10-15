import java.math.BigInteger;
import java.util.Scanner;

public class Bai_5_20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        long[] array = new long[100];

        for (int i = 0; i < n; i++) {
            array[i] = sc.nextLong();
        }

        System.out.print(gcdArray(array));

    }
    // Function to calculate GCD of two numbers
    public static long gcd(long a, long b) {
        return BigInteger.valueOf(a).gcd(BigInteger.valueOf(b)).intValue();
    }

    // Function to calculate GCD of an array of numbers
    public static long gcdArray(long[] arr) {
        long result = arr[0];
        for (int i = 1; i < arr.length; i++) {
            result = gcd(result, arr[i]);

            // If at any point GCD becomes 1, we can break early
            if (result == 1) {
                return 1;
            }
        }
        return result;
    }
}
