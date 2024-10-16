import java.util.Scanner;

public class Bai_6_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        String target = sc.nextLine();

        int count = 0;
        int index = 0;

        while ((index = input.indexOf(target, index)) != -1) {
            count++;
            index++;
        }

        System.out.print(count);


    }
}
