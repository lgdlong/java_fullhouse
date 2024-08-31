import java.util.Scanner;

public class Bai_3_19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c, res;
        b = sc.nextInt();
        a = sc.nextInt();

        c = b / a;
        res = c * a;

        System.out.println(res);
    }
}