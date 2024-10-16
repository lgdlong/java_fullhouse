import java.util.Scanner;

public class Bai_6_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        String result = isPasswordComplex(input) ? "MANH" : "YEU";

        System.out.print(result);
    }

    public static boolean isPasswordComplex(String input) {
        boolean hasUpperCase = false;
        boolean hasLowerCase = false;
        boolean hasNumber = false;

        if (input.length() < 8) return false;
        else {
            for (char c : input.toCharArray()) {
                if (Character.isDigit(c)) {
                    hasNumber = true;
                } else if (Character.isUpperCase(c)) {
                    hasUpperCase = true;
                } else if (Character.isLowerCase(c)) {
                    hasLowerCase = true;
                }
            }

            // If all condition true
            return hasNumber && hasUpperCase && hasLowerCase;
        }
    }
}
