import java.util.Scanner;

public class Bai_4_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, y, res;
        x = sc.nextInt();
        y = sc.nextInt();
        res = Math.abs(x - y);
        if (x > y) res *= 3;

        System.out.println(res);
    }
}
