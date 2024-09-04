import java.util.ArrayList;
import java.util.Scanner;

class ThongSo {
    double l, d, x, alpha;

    public ThongSo(double l, double d, double x, double alpha) {
        this.l = l;
        this.d = d;
        this.x = x;
        this.alpha = alpha;
    }
}

public class Bai_4_33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        ArrayList<ThongSo> testcases = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            double c = sc.nextDouble();
            double d = sc.nextDouble();

            testcases.add(new ThongSo(a, b, c, d));
        }

        for (ThongSo i : testcases) {
            System.out.println(calculate(i));
        }

        sc.close();
    }

    public static long calculate(ThongSo temp) {
        double l = temp.l;
        double d = temp.d;
        double x = temp.x;
        double alpha = temp.alpha;
        double alphaRadians = Math.toRadians(alpha);

        double z, y, count;

        if (alpha == 90) {
            return 0; // Light goes straight up or down, no crossing
        } else if (alpha < 90) {
            y = x * Math.tan(alphaRadians);
            z = d * Math.tan(alphaRadians);

            count = (l - y) / z;
        } else { // alpha > 90
            alpha = 180 - alpha; // Reflect angle over 90 degrees
            y = (d - x) * Math.tan(Math.toRadians(alpha));
            z = d * Math.tan(Math.toRadians(alpha));

            count = (l - y) / z;
        }

        return (count > 0) ? (Math.round(count) + 1) : 0;
    }
}
