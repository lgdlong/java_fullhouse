import java.util.Scanner;

public class Bai_6_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        StringBuilder result = new StringBuilder();

        char deletedChar = findMaxChar(input);

        for (int i = 0; i < input.length(); i++) {

            char currentChar = input.charAt(i);

            if (currentChar != deletedChar) {
                result.append(currentChar);
            }

        }

        String finalStr = result.toString().trim();

        System.out.print(finalStr);
    }

    public static char findMaxChar(String input) {
        char[] charArr = input.toCharArray();

        char max = charArr[0];

        for (char ch : charArr) {
            if (ch > max) max = ch;
        }

        return max;
    }
}
