import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class TestCase {
    int a1, a2, a3, a4, b;

    // Initialize the TestCase with provided values
    public TestCase(int x, int y, int z, int t, int v) {
        a1 = x;
        a2 = y;
        a3 = z;
        a4 = t;
        b = v;
    }
}

public class Bai_4_16 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt(); // Number of test cases

            // List to store test cases
            ArrayList<TestCase> testCases = new ArrayList<>(n);

            // Read input and create test cases
            for (int i = 0; i < n; i++) {
                int a1 = sc.nextInt();
                int a2 = sc.nextInt();
                int a3 = sc.nextInt();
                int a4 = sc.nextInt();
                int b = sc.nextInt();

                // Create a new TestCase object with the given values
                testCases.add(new TestCase(a1, a2, a3, a4, b));
            }

            // Check each TestCase and print the result
            for (TestCase testCase : testCases) {
                System.out.println(check(testCase) ? "Yes" : "No");
            }
        } // The scanner is automatically closed
    }

    // Method to check the conditions for each TestCase
    public static boolean check(TestCase testCase) {
        int[] sides = {testCase.a1, testCase.a2, testCase.a3, testCase.a4};

        // Check if all sides are equal
        boolean areAllSidesEqual = (sides[0] == sides[1] && sides[1] == sides[2] && sides[2] == sides[3]);

        // Calculate the sum and the maximum side length
        int sumSides = sides[0] + sides[1] + sides[2] + sides[3];
        int longestSide = Arrays.stream(sides).max().getAsInt();

        // If all sides are equal, return true
        if (areAllSidesEqual) {
            return true;
        }

        // Check if the difference between 4 times the longest side and the sum of sides equals b
        return (longestSide * 4 - sumSides) == testCase.b;
    }
}