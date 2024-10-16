import java.util.Scanner;

public class Bai_6_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        int beginIndex = sc.nextInt();
        int lastIndex = sc.nextInt();


        String result = input.substring(0, beginIndex - 1) + input.substring(lastIndex);

        System.out.print(result);
    }
}
