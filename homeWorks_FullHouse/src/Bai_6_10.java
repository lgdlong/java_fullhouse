import java.util.Scanner;

public class Bai_6_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        String input = sc.nextLine();

        boolean hasA = false;
        boolean hasB = false;
        boolean hasC = false;

        char[] ch = input.toCharArray();

        int index = 0;

        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == 'A') {
                hasA = true;
            } else if (ch[i] == 'B') {
                hasB = true;
            } else if (ch[i] == 'C') {
                hasC = true;
            }

            if (hasA && hasB && hasC) {
                index = i + 1; break;
            }
        }

        System.out.print(index);
    }
}
