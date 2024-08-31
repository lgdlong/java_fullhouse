import java.util.Scanner;

public class Bai_4_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        boolean a, b;
        a = (n % 3 == 0);
        b = (n % 7 == 0);



        System.out.println(check(a, b) ? 1 : 0);
    }
    public static boolean check(boolean a, boolean b) {
        if (a || b) {
            return !a || !b;
        }
        else return false;
    }
}

/*
* a | b | res
* 1 | 1 | 0
* 0 | 1 | 1
* 1 | 0 | 1
* 0 | 0 | 0
* Using EXOR gate: !a.b + a.!b

* c = !a && b;
* d = a && !b;
* i = (c || d) ? 1 : 0;
* */
