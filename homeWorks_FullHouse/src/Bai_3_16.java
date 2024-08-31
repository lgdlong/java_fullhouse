import java.util.Scanner;

public class Bai_3_16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, c, d, e, f, g, p, sub, res;
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();

        g = a + b + c;
        p = g / 2;
        d = p - a;
        e = p - b;
        f = p - c;
        sub = p * d * e * f;

        res = Math.sqrt(sub);

        System.out.printf("%.2f", res);
    }
}
