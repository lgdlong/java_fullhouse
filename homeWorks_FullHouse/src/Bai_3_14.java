import java.util.Scanner;

public class Bai_3_14 {
    public static void main(String[] args) {
        // BANG CUU CHUONG
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();

        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }
}
