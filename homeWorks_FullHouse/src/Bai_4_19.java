import java.util.Scanner;

public class Bai_4_19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, c, bao, mam;

        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();

        mam = Math.abs(c - a);
        bao = Math.abs(c - b);

        String res;
        if (bao < mam) {
            res = "BAO";
        } else if (bao > mam) {
            res = "MAM";
        }
        else res = "CHUOT";

        System.out.print(res);
    }
}
