import java.util.Scanner;

public class Bai_6_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder res = new StringBuilder();

        // Input string
        String input = sc.nextLine();

        // Input indices (adjusted to 0-based index)
        int beginIndex = sc.nextInt() - 1;
        int lastIndex = sc.nextInt() - 1;

        // Append characters outside the range [beginIndex, lastIndex]
        for (int i = 0; i < input.length(); i++) {
            if (i < beginIndex || i > lastIndex) {
                res.append(input.charAt(i));
            }
        }

        // Output the result
        System.out.print(res.toString().trim());
    }
}