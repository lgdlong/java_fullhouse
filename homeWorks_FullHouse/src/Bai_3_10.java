import java.util.Scanner;

public class Bai_3_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double h = sc.nextDouble();

        double res = Math.sqrt(2 * 9.8 * h);

        System.out.printf("%.5f", res);
    }
}