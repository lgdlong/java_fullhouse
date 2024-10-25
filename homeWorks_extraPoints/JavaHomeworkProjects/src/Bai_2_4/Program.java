package Bai_2_4;

public class Program {
    public static void main(String[] args) {
        Fraction f1 = new Fraction(4, 7);
        Fraction f2 = new Fraction(8, 12);

        System.out.println(f1.add(f2));
        System.out.println(f1.minus(f2));
        System.out.println(f1.time(f2));
        System.out.println(f1.div(f2));

        System.out.println();

        System.out.println(f1.simplify());
        System.out.println(f2.simplify());

    }
}
