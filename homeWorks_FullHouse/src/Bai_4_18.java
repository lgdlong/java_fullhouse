import java.util.ArrayList;
import java.util.Scanner;

class Candy{
    int x, y, u, v, t;

    public Candy(int a, int b, int c, int d, int e) {
        x = a;
        y = b;
        u = c;
        v = d;
        t = e;
    }

    public void display() {
        System.out.printf("%d %d %d %d %d\n", x, y, u, v, t);
    }
}

public class Bai_4_18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Candy> candies = new ArrayList<>();

        int a, b, c, d, e;
        for (int i = 0; i < n; i++) {
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();
            d = sc.nextInt();
            e = sc.nextInt();

            candies.add(new Candy(a, b, c, d, e));
        }
        for (Candy candy : candies)  {
            System.out.println(out(candy));
        }
    }
    public static int out(Candy temp) {
        int a, b, c, d, e, price, bestPrice;
        a = temp.x;
        b = temp.y;
        c = temp.u;
        d = temp.v;
        e = temp.t;

        int candyHasHigherPrice = (Math.min(c, d) == c) ? b : a;
        int lowestPriceOfCandies = Math.min(c, d);

        price = a * c + b * d;
        bestPrice = (a + b) * lowestPriceOfCandies + candyHasHigherPrice * e;

        return Math.min(bestPrice, price);
    }
}