import java.util.Scanner;

public class Bai_4_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b;
        double res;
        a = sc.nextDouble();
        b = sc.nextDouble();
        
        double soDien = b - a;
        
        // Cong thuc cac muc tien
        double muc1 = 550 * soDien;
        double muc2 = (550 * 100) + 1110 * (soDien - 100);
        double muc3 = (550 * 100) + (1110 * 50) * (soDien - 150);
        double muc4 = (550 * 100) + (1110 * 50) + (1470 * 50) + 1600 * (soDien - 200);
        double muc5 = (550 * 100) + (1110 * 50) + (1470 * 50) + (1600 * 100) + 1720 * (soDien - 300);
        double muc6 = (550 * 100) + (1110 * 50) + (1470 * 50) + (1600 * 100) + 1720 * 100 + 1780 * (soDien - 400);
        
        // Tinh tien dien
        if (soDien <= 100) {
            res = muc1;
        } else if (soDien <= 150) {
            res = muc2;
        } else if (soDien <= 200) {
            res = muc3;
        } else if (soDien <= 300) {
            res = muc4;
        } else if (soDien <= 400) {
            res = muc5;
        } else {
            res = muc6;
        }

        res += res/10;
        System.out.printf("%d", (long)res);
    }
}
/*
* 550 * 100 + 
* muc 1: 100 - 550
* muc 2: +50 - 1110
* muc 3: +50 - 1470
* muc 4: +100 - 1600
* muc 5: +100 - 1720
* muc 6: +... - 1780
* 
* +10% thue
* 
* 
* */
