import java.util.Scanner;

public class Bai_4_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a, b, c;
        a = sc.nextLong();
        b = sc.nextLong();
        c = sc.nextLong();

        boolean d = (c*c == a*a + b*b)
                 || (a*a == c*c + b*b)
                 || (b*b == c*c + a*a);
        System.out.println(d ? "Yes" : "No");
    }
}
