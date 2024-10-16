import java.util.Scanner;

public class Bai_6_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();

        System.out.print(formatName(name));
    }


    /**
     * Formats the input string by capitalizing the first letter of each word and converting the rest
     * of the letters to lowercase. Words are assumed to be separated by spaces.
     *
     * @param input The input string that contains the words to format.
     *              - The input may contain multiple spaces between words.
     *              - The input may have words in any letter case.
     * @return A formatted string where the first letter of each word is capitalized, and the rest of
     *         the letters in each word are in lowercase. If the input contains multiple spaces, they
     *         are normalized to a single space between words in the output.
     */
    public static String formatName(String input) {
        String[] words = input.split("\\s+");

        StringBuilder result = new StringBuilder();

        for (String word : words) {

            if (word.length() <= 1) { // Check if name just have 1 character each word
                result.append(word.toUpperCase()).append(" ");
            } else {
                result.append(Character.toTitleCase(word.charAt(0)))
                  .append(word.substring(1).toLowerCase())
                  .append(" ");
            }
        }

        return result.toString().trim();
    }
}
