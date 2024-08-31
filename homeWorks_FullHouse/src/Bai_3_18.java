import java.util.Scanner;

public class Bai_3_18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long x, y, z, t, res;
        x = sc.nextInt();
        y = sc.nextInt();
        z = sc.nextInt();
        t = sc.nextInt();

        res = (x * z * 2 + z * y * 2) * 39;
        System.out.print(res);

        sc.close();
    }
}
