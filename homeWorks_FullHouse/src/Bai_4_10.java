import java.util.Scanner;

public class Bai_4_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a, b, c;
        a = sc.nextLong();
        b = sc.nextLong();
        c = sc.nextLong();

        boolean check = b * b == a * c;

        System.out.print((check) ? "YES" : "NO");

        sc.close();
    }
}