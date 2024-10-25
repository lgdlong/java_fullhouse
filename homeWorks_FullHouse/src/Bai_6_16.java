import java.util.Scanner;

public class Bai_6_16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        int titleCaseNumber = 0;
        int lowerCaseNumber = 0;
        int digitNumber = 0;

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (Character.isUpperCase(currentChar)) {
                titleCaseNumber++;
            } else if (Character.isLowerCase(currentChar)) {
                lowerCaseNumber++;
            } else if (Character.isDigit(currentChar)) {
                digitNumber++;
            }
        }

        System.out.printf("%d %d %d", titleCaseNumber, lowerCaseNumber, digitNumber);

        sc.close();
    }
}
