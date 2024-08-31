import java.util.Scanner;

public class Bai_3_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a, b, c;
        a = sc.nextLong();
        b = sc.nextLong();
        c = sc.nextLong();
        long res = a * b * c * 1000;
        System.out.println(res);
    }
}