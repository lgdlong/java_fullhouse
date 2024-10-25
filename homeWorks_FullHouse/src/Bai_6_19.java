import java.util.Scanner;

public class Bai_6_19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        boolean isTitleFirstChar = Character.isUpperCase(input.charAt(0));

        // Compare current substring with lowercase substring
        boolean isLowerSubstring = input.substring(1).equals(input.substring(1).toLowerCase());

        boolean isTitleCase = isTitleFirstChar && isLowerSubstring;

        System.out.print(isTitleCase ? "Yes" : "No");
    }
}
