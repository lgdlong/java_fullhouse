import java.util.Scanner;

public class Bai_4_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String res;
        switch (n)  {
            case 2:
                res = "Monday";
                break;
            case 3:
                res = "Tuesday";
                break;
            case 4:
                res = "Wednesday";
                break;
            case 5:
                res = "Thursday";
                break;
            case 6:
                res = "Friday";
                break;
            case 7:
                res = "Saturday";
                break;
            case 8:
                res = "Sunday";
                break;
            default:
                res = "";
                break;
        }

        System.out.print(res);
    }
}
