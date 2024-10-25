import java.util.Scanner;

public class Bai_6_17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        String[] words = input.split("\\s+");

        int maxLength = Integer.MIN_VALUE;
        String maxString = "";

        for (String word: words) {
            if (word.length() > maxLength) {
                maxLength = word.length();
                maxString = word;
            }
        }

        System.out.print(maxString);
    }
}
