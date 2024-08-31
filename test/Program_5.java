import java.util.ArrayList;
import java.util.Scanner;

public class Program_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        ArrayList<Integer> split = new ArrayList<>();
        if (n < 0) {
            System.out.println("Invalid number");
        } else {
            if (isArmstrong(split, n)) System.out.println("This is an Armstrong number");
            else System.out.println("This is not an Armstrong number");
        }
    }
    public static boolean isArmstrong(ArrayList<Integer> split, int n) {
        // Split number
        int temp = n;
        while (temp != 0) {
            split.add(temp % 10);
            temp /= 10;
        }

        // Calculate
        long sum = 0;
        int j = split.size();
        for (int i : split) {
            sum += (long)Math.pow(i, j);
        }
        return sum == n;
    }
}
