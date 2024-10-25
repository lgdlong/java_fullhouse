import java.util.Scanner;

public class Bai_6_21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();


    }

    public static boolean isStrongPassword(String input) {
        boolean hasTitleCase = false;
        boolean hasLowerCase = false;
        boolean hasDigit = false;

        if (input.length() < 6) {
            return false;
        } else {
            char currentChar;
            for (int i = 0; i < input.length(); i++) {
                currentChar = input.charAt(i);
                if (Character.isUpperCase(currentChar)) {
                    hasTitleCase = true;
                } else if (Character.isLowerCase(currentChar)) {
                    hasLowerCase = true;
                } else if (Character.isDigit(currentChar)) {
                    hasDigit = true;
                }
            }
        }

        return hasTitleCase && hasDigit && hasLowerCase;
    }
}
