import java.util.Scanner;

abstract class Shape {
    abstract double Area();
    abstract double Perimeter();
}

class Circle extends Shape {
    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double Area() {
        return Math.PI * radius * radius;
    }

    @Override
    double Perimeter() {
        return 2 * Math.PI * radius;
    }
}

class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle() {
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double Area() {
        return width * height;
    }

    @Override
    double Perimeter() {
        return 2 * (width + height);
    }
}

class Triangle extends Shape {
    private double side1;
    private double side2;
    private double side3;

    public Triangle() {
    }

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    @Override
    public double Area() {
        double p = (side1 + side2 + side3) / 2;
        return Math.sqrt(p * (p - side1) * (p - side2) * (p - side3));
    }

    @Override
    double Perimeter() {
        return side1 + side2 + side3;
    }
}

public class Bai_10_11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String lineInput = sc.nextLine();

        try {
            Shape shape = createShape(lineInput);

            if (shape != null) {
                System.out.printf("%.3f\n", shape.Area());
                System.out.printf("%.3f", shape.Perimeter());
            } else {
                System.out.println("Invalid input. Could not create shape.");
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        sc.close();

    }

    /**
     * Creates a shape based on the input string. Supports "Circle", "Rectangle", and "Triangle".
     * Throws an IllegalArgumentException if input is invalid.
     *
     * @param lineInput The input string containing shape type and dimensions.
     * @return A Shape object (Circle, Rectangle, or Triangle) or null if the shape can't be created.
     */
    public static Shape createShape(String lineInput) {
        String[] data = lineInput.split("\\s+");

        // Create a Circle if input matches the format "Circle radius"
        if (data.length == 2 && data[0].equalsIgnoreCase("Circle")) {
            try {
                double radius = Double.parseDouble(data[1]);
                return new Circle(radius);
            } catch (NumberFormatException e) {
                throw new IllegalArgumentException("Invalid radius for Circle.");
            }

            // Create a Rectangle if input matches the format "Rectangle width height"
        } else if (data.length == 3 && data[0].equalsIgnoreCase("Rectangle")) {
            try {
                double width = Double.parseDouble(data[1]);
                double height = Double.parseDouble(data[2]);
                return new Rectangle(width, height);
            } catch (NumberFormatException e) {
                throw new IllegalArgumentException("Invalid dimensions for Rectangle.");
            }

            // Create a Triangle if input matches the format "Triangle side1 side2 side3"
        } else if (data.length == 4 && data[0].equalsIgnoreCase("Triangle")) {
            try {
                double side1 = Double.parseDouble(data[1]);
                double side2 = Double.parseDouble(data[2]);
                double side3 = Double.parseDouble(data[3]);
                return new Triangle(side1, side2, side3);
            } catch (NumberFormatException e) {
                throw new IllegalArgumentException("Invalid dimensions for Triangle.");
            }

        } else {
            throw new IllegalArgumentException("Unsupported shape type or incorrect number of parameters.");
        }
    }
}
