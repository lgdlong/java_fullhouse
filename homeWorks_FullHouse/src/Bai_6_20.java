import java.util.Scanner;

public class Bai_6_20{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the full name
        String input = sc.nextLine().trim();

        // Find the last space and extract the substring after it (last name)
        int lastSpaceIndex = input.lastIndexOf(" ");

        // If there is no space, the whole input is the last name
        String lastName = (lastSpaceIndex == -1) ? input : input.substring(lastSpaceIndex + 1);

        // Print the last name
        System.out.print(lastName);
    }
}
