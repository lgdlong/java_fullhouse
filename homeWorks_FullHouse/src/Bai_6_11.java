import java.util.Scanner;

public class Bai_6_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        int length1 = str1.length();
        int length2 = str2.length();

        if (length1 < length2) {
            System.out.print(str2.toUpperCase());
        } else if (length1 > length2) {
            System.out.print(str1.toUpperCase());
        } else {
            System.out.print(str2.toUpperCase());
        }

    }
}
