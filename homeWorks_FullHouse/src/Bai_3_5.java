import java.util.Scanner;

public class Bai_3_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble(), b = sc.nextDouble();

        System.out.printf("%d\n%.2f", (long)(a + b), a + b);
    }
}