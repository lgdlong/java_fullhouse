import java.util.Scanner;

public class Bai_4_29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n, b, a, c, d;
        n = sc.nextDouble();
        b = sc.nextDouble();

        d = b / n;
        a = Math.log(d);
        c = Math.log(2);
        double res = a / c;

        System.out.printf("%d", (long)res);
    }
}