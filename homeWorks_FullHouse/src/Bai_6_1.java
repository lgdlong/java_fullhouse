import java.util.Scanner;

public class Bai_6_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        char[] charArr = input.toCharArray();

        long sum = 0;
        for (char i : charArr) {
            if (Character.isDigit(i)) {
                sum += Integer.parseInt(String.valueOf(i));
            }
        }

        System.out.print(sum);
    }
}
