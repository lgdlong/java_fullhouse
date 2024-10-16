import java.util.Scanner;

public class Bai_6_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String toInsert = sc.nextLine();
        int k = sc.nextInt();

        StringBuilder result = new StringBuilder();

        result.append(str).insert(k, toInsert);

        System.out.print(result.toString().trim());
    }
}
