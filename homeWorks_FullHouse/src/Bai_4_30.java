import java.util.Scanner;

public class Bai_4_30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a, b, c, count;
        a = sc.nextLong();
        b = sc.nextLong();

        // Formula = x = a - 2 * b
        c = 2 * b;
        count = a - c;

        System.out.print(count);
    }
}
/*
* 2(b + x) = a + x
* x = a - 2b
* */
