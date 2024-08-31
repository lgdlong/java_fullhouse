import java.util.Scanner;

public class Bai_4_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a, b, c, res;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        boolean check = (a + c) == b * 2;

        if (check) res = a + b + c;
        else res = -1;

        System.out.println(res);
    }
}
