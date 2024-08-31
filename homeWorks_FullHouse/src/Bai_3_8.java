import java.util.Scanner;

public class Bai_3_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double r = sc.nextDouble();
        double pi = Math.PI;
        double a, b, c;

        a = 2*r*pi;
        b = pi*r*r;
        c = (4.0/3)*pi*Math.pow(r, 3);

        System.out.printf("%.6f\n%.6f\n%.6f",a , b, c);
    }
}

