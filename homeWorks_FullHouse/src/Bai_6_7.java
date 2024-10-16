import java.util.Scanner;

public class Bai_6_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        sc.nextLine();

        String input = sc.nextLine();

        String target = "ABC";

        int index = input.indexOf(target);
        if (index != -1) {
            index++;
        }

        System.out.println(index);
    }
}
