import java.util.Scanner;

public class Bai_3_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, r;
        a = sc.nextDouble();
        b = sc.nextDouble();
        r = sc.nextDouble();

        double res = a*b - Math.PI*r*r;

        System.out.printf("%.2f", res);
    }
}