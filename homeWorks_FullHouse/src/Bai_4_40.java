import java.util.Scanner;

public class Bai_4_40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        boolean d, e, f, g, h;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        d = a == b;
        e = b == c;
        f = c == a;
        g = d || e;
        h = g || f;

        System.out.print((h) ? "Yes" : "No");
    }
}
