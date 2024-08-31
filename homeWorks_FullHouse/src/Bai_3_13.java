import java.util.Scanner;

public class Bai_3_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte n = sc.nextByte();

        if (n >= 0) {
            for (int i = 1; i <= 6; i++) {
                for (int j = 1; j <= 4; j++) {
                    if ((2 <= i && i <= 5) && (2 <= j && j <= 3))
                        System.out.print(" ");
                    else
                        System.out.print(n);
                }
                if (i != 6) System.out.println();
            }
        }
        else {
            for (int i = 1; i <= 6; i++) {
                for (int j = 1; j <= 4; j++) {
                    if ((2 <= i && i <= 5) && (2 <= j && j <= 3))
                        System.out.print("  ");
                    else
                        System.out.print(n);
                }
                if (i != 6) System.out.println();
            }
        }
    }
}

/*
-3
-3-3-3-3
-3    -3
-3    -3
-3    -3
-3    -3
-3-3-3-3
*/
