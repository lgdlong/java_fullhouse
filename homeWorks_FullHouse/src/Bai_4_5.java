import java.util.Scanner;

public class Bai_4_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, c, lenBao, lenMam;
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        lenBao = Math.abs(c - b);
        lenMam = Math.abs(c - a);

        String res = check(lenBao, lenMam);

        System.out.println(res);

        sc.close();
    }
    public static String check(double lenBao, double lenMam) {
        if (lenBao < lenMam) {
            return "BAO";
        }
        else if(lenBao > lenMam) {
            return "MAM";
        }
        else
            return "CHUOT";
    }
}