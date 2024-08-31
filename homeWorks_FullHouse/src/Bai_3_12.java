import java.util.Scanner;

public class Bai_3_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a, b, c, d, e;
        a = sc.nextLong();
        b = sc.nextLong();
        c = sc.nextLong();
        d = a % b;
        e = a * b % c;
        System.out.printf("%d %d", d, e);
    }
}
