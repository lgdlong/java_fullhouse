package Bai_1_17;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Point[] points = new Point[3];

        char temp = 'A';

        for (int i = 0; i < 3; i++) {
            System.out.printf("Enter x%s: ", (char) (temp + i));
            int x = sc.nextInt();
            System.out.printf("Enter y%s: ", (char) (temp + i));
            int y = sc.nextInt();

            points[i] = new Point(x, y);
        }

        Triangle ABC = new Triangle(points[0], points[1], points[2]);

        if (!ABC.isTriangle()) {
            System.out.print("Triangle invalid.");
        } else {
            System.out.printf("Perimeter: %f\nArea: %f", ABC.getPerimeter(), ABC.getArea());
        }

        sc.close();
    }
}


