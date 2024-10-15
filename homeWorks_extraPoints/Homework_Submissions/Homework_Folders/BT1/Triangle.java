package Bai_1_17;

class Triangle extends Point {
    private Point p1;
    private Point p2;
    private Point p3;

    public Triangle() {
    }

    public Triangle(Point p1, Point p2, Point p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    public static double distanceBetween(Point p1, Point p2) {
        int x1 = p1.getX();
        int x2 = p2.getX();
        int y1 = p1.getY();
        int y2 = p2.getY();

        // Pythagorean theorem
        return Math.sqrt(Math.pow(Math.abs(x1 - x2), 2) + Math.pow(Math.abs(y1 - y2), 2));
    }

    // Calculate AB, BC, AC after points are set
    private double getAB() {
        return distanceBetween(p1, p2);
    }

    private double getBC() {
        return distanceBetween(p2, p3);
    }

    private double getAC() {
        return distanceBetween(p1, p3);
    }



    public boolean isTriangle() {
        double AB = getAB();
        double BC = getBC();
        double AC = getAC();
        return (AB + BC > AC) && (AB + AC > BC) && (BC + AC > AB);
    }

    public double getPerimeter() {
        return getAB() + getBC() + getAC();
    }

    public double getArea() {
        double AB = getAB();
        double BC = getBC();
        double AC = getAC();
        double p = (AB + BC + AC) / 2;

        // Heron's formula
        return Math.sqrt(p * (p - AC) * (p - AB) * (p - BC));
    }
}