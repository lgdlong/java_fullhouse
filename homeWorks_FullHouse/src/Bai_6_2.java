import java.util.ArrayList;
import java.util.Scanner;

public class Bai_6_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        // Declare an array to store string
        ArrayList<String> arr = new ArrayList<>();

        // Input strings
        for (int i = 0; i < n; i++) {
            String temp = sc.nextLine();

            // Do your work here...
            String str = format(temp);

            arr.add(str);
        }



        for (String i : arr) {
            String temp = i.trim();
            System.out.println(temp);
        }
    }

    public static String format(String input) {
        String[] words = input.split("\\s+");
        StringBuilder newStr = new StringBuilder();

        for (String word : words) {
            newStr.append(word).append(" ");
        }

        return newStr.toString().trim();
    }
}
