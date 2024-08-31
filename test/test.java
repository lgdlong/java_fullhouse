import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("2 + 3 = " +
                (sc.nextInt() + sc.nextInt()));


        sc.close();
    }
}