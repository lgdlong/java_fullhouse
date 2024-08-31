import java.util.Scanner;

public class Bai_4_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, y, sum;

        x = sc.nextInt();
        y = sc.nextInt();

        sum = x + y;

        if (x == y) sum *= 3;

        System.out.println(sum);
    }


}
