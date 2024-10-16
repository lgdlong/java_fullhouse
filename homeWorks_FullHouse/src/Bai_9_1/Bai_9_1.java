package Bai_9_1;

import java.util.Scanner;

class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}

class Triangle {
    private Point p1;
    private Point p2;
    private Point p3;

    private double ab;
    private double bc;
    private double ac;

    public Triangle(Point p1, Point p2, Point p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;

        this.ab = distanceBetween(p1, p2);
        this.bc = distanceBetween(p2, p3);
        this.ac = distanceBetween(p1, p3);
    }

    public boolean isTriangle() {
        return (ab + bc > ac) && (ab + ac > bc) && (bc + ac > ab);
    }

    // Method to display the triangle's points
    public void displayPoints() {
        System.out.println("Triangle Points:");
        System.out.println("Point 1: " + p1);
        System.out.println("Point 2: " + p2);
        System.out.println("Point 3: " + p3);
    }

    public static Triangle readInput() {
        Scanner sc = new Scanner(System.in);

        Point p1 = readPoint(sc);
        Point p2 = readPoint(sc);
        Point p3 = readPoint(sc);

        return new Triangle(p1, p2, p3);
    }

    // Helper method to read a point
    private static Point readPoint(Scanner sc) {
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        return new Point(x, y);
    }

    private static double distanceBetween(Point p1, Point p2) {
        return Math.sqrt(Math.pow(Math.abs(p1.getX() - p2.getX()) ,2) + Math.pow(p1.getY() - p2.getY(), 2));
    }

    private double getAB() {
        return ab;
    }
    private double getBC() {
        return bc;
    }
    private double getAC() {
        return ac;
    }

    public double getArea() {
        double p = (getAB() + getBC() + getAC()) / 2;
        return Math.sqrt(p * (p - getAC()) * (p - getAB()) * (p - getBC()));
    }

    public double getPerimeter() {
        return getAB() + getAC() + getBC();
    }
}

public class Bai_9_1 {
    public static void main(String[] args) {
        Triangle triangle = Triangle.readInput();

        System.out.printf("%.2f %.2f", triangle.getPerimeter(), triangle.getArea());
    }
}
