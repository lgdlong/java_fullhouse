import java.util.Scanner;

public class Bai_5_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();

        long temp, count = 0, i = 0;
        while (i < n){
            temp = sc.nextLong();
            if (temp % 2 == 0)
                count++;
            i++;
        }

        System.out.println(count);
        sc.close();
    }
}
