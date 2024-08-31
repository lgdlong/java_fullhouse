import java.util.Scanner;

public class Bai_3_17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x1, y1, x2, y2, a, b, c, d, g, res;
        x1 = sc.nextDouble();
        y1 = sc.nextDouble();
        x2 = sc.nextDouble();
        y2 = sc.nextDouble();

        a = x2 - x1;
        b = y2 - y1;
        c = a * a;
        d = b * b;
        g = c + d;
        res = Math.sqrt(g);

        System.out.printf("%.2f", res);
    }
}
