package Bai_2_4;

public class Fraction {
    private long number;
    private long denominator;

    public Fraction() {
    }

    public Fraction(long number, long denominator) {
        this.number = number;
        this.denominator = denominator;

        if (denominator == 0) {
            throw new IllegalArgumentException("Denominator cannot be zero.");
        }

    }

    public long getNumber() {
        return number;
    }

    public long getDenominator() {
        return denominator;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public void setDenominator(long denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("Denominator cannot be zero.");
        }
        this.denominator = denominator;
    }

    public Fraction add(Fraction f) {
        long newNumer = this.number * f.denominator + f.number * this.denominator;
        long newDenom = this.denominator * f.denominator;
        return new Fraction(newNumer, newDenom).simplify();
    }

    public Fraction minus(Fraction f) {
        long newNumer = this.number * f.denominator - f.number * this.denominator;
        long newDenom = this.denominator * f.denominator;
        return new Fraction(newNumer, newDenom).simplify();
    }

    public Fraction time(Fraction f) {
        long newNumer = this.number * f.number;
        long newDenom = this.denominator * f.denominator;
        return new Fraction(newNumer, newDenom).simplify();
    }

    public Fraction div(Fraction f) {
        if (f.number == 0) {
            throw new IllegalArgumentException("Cannot divide by a fraction with zero numerator.");
        }
        long newNumer = this.number * f.denominator;
        long newDenom = this.denominator * f.number;
        return new Fraction(newNumer, newDenom).simplify();
    }

    public Fraction simplify() {
        Fraction fraction = new Fraction(number, denominator);

        long gcd = gcd(number, denominator);

        while (gcd != 1) {
            fraction.number /= gcd;
            fraction.denominator /= gcd;

            gcd = gcd(fraction.number, fraction.denominator);
        }

        return fraction;
    }

    public static long gcd(long a, long b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static long lcm(long a, long b) {
        return a * b / gcd(a, b);
    }

    @Override
    public String toString() {
        return String.format("Fraction [%d / %d]", number, denominator);
    }
}
