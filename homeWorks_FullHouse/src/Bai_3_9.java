import java.util.Scanner;

public class Bai_3_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long m1, m2;
        double d1, d2;
        m1 = sc.nextInt();
        m2 = sc.nextInt();
        d1 = sc.nextDouble();
        d2 = sc.nextDouble();

        System.out.printf("%d\n%.1f\n%.1f\n%d\n%.1f\n%.1f\n%d\n%.1f\n%.1f\n%d\n%.1f\n%.1f",
                m1 + m2,
                d1 + d2,
                m1 + d2,
                m1 - m2,
                d1 - d2,
                m1 - d2,
                m1 * m2,
                d1 * d2,
                m1 * d2,
                m1 / m2,
                d1 / d2,
                m1 / d2);

    }
}
/*
m₁ + m2 =
d₁ + d₂ =
m₁ + d₂ =
m₁ − m₂ =
d₁ − d₂ =
m₁ − d₂ =
m₁ * m₂ =
d₁ * d₂ =
m1 * d2 =
m₁ / m₂ =
d₁ / d₂ =
m₁ / d₂ =
*/
