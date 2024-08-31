import java.util.Scanner;

public class Bai_4_27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h, m, a, b, timeDifferent, timeAfterModify, temp;
        h = sc.nextInt();
        m = sc.nextInt();
        a = sc.nextInt();
        b = sc.nextInt();

        timeDifferent = b - a;

        timeAfterModify = h + timeDifferent;

        temp = timeAfterModify + 24; // Just for better performance

        h = (temp) % 24; // ChatGPT shorted it for me

        System.out.printf("%d %d", h, m);
    }
}

/*
    if (0 <= timeAfterModify && timeAfterModify < 24) {
        h = timeAfterModify;
    }
    else if (timeAfterModify >= 24) {
        h = timeAfterModify - 24;
    }
    else { // timeAfterModify < 0
        h = timeAfterModify + 24;
    }
* */
