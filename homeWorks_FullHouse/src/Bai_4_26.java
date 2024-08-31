import java.util.Scanner;

public class Bai_4_26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c, d, e;
        a = sc.nextInt();
        b = sc.nextInt();

        c = (int) Math.floor((double)a / b);
        d = (int) Math.ceil((double)a / b);
        e = (int) Math.round((double)a / b);

        System.out.printf("floor(%d/%d)=%d\n", a, b, c);
        System.out.printf("ceil(%d/%d)=%d\n", a, b, d);
        System.out.printf("round(%d/%d)=%d", a, b, e);
    }
}
