import java.util.Scanner;

public class Bai_6_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        int index = input.lastIndexOf(".");

        String result = input.substring(index + 1);

        System.out.print(result);
    }
}
