import java.util.Scanner;

public class Bai_3_20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n, a, b, c, res;
        n = sc.nextInt();
        c = n * n;
        a = 450 * c;
        b = 15 * n;
        res = a - b;
        System.out.println(res);
    }
}

/*
* There are 30 classes:
* Each class picks n student for activity
* How many hand-shake for total all students have to do?
*
* Number of students: 30 * n;
* Times each has to handshake: 30 * n - 1;
* 2 student just handshake 1 time:
*  -> 30 * (30 * n - 1) /2 -> 450 * n^2 - 15 * n
*
* handShakeForEach = 30 * n - 1;
* totalStudentHasToDo = 15 * n;
* result = totalStudentHasToDo * handShakeForEach;
* */
