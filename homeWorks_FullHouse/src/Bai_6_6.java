import java.util.Arrays;
import java.util.Scanner;

public class Bai_6_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read input
        String input = sc.nextLine();

        // Call toNumberArray and get the resulting string array
        String[] arr = toNumberArray(input);

        // Convert array to space-separated string
        String result = String.join(" ", arr);

        // Output the result
        System.out.print(result);
    }

    public static String[] toNumberArray(String input) {
        // Split by non-digit characters and filter out empty strings
        return Arrays.stream(input.split("\\D+"))
                .filter(str -> !str.isEmpty()) // Remove empty strings
                .toArray(String[]::new);       // Collect into a String array
    }
}