import java.util.Scanner;

public class Bai_5_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long k = sc.nextLong();

        int temp;
        long pos = 0; // Store list of number from keyboard
        for (int i = 0; i < n; i++) {
            temp = sc.nextInt();
            if (temp == k && pos == 0) {
                pos = k;
            }
        }

        if (pos == 0) {
            System.out.print("KHONG CO K");
        } else {
            System.out.print("CO K O VI TRI " + (pos + 1));
        }

        sc.close();
    }
}