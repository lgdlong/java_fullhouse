import java.util.Scanner;

public class Bai_4_43 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.print(getN(n));
    }
    public static int getN(int n) {
        if (n % 2 == 0) {
            return n;
        }
        else {
            return n * 2;
        }
    }
}
