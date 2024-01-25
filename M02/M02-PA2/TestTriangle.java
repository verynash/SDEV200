/*
 * Name:    Zachary Barrett
 * Date:    01-25-2024
 * Program: TestTriangle.java
 * Purpose: Test the Triangle and GeometricObject classes.
 */

import java.util.*;

public class TestTriangle {
    public static void main(String[] args) {
        // Create new scanner
        Scanner input = new Scanner(System.in);
        // Prompt user to input side lengths
        System.out.println("Enter the length of the three sides: ");
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();
        input.nextLine();
        // Prompt user to input color
        System.out.println("Enter the color of the triangle: ");
        String color = input.nextLine();
        // Prompt user to input whether filled or not
        System.out.println("Enter true for filled or false for not filled: ");
        boolean filled = input.nextBoolean();

        // Create new triangle using specified values
        Triangle triangle = new Triangle(side1, side2, side3, color, filled);
        // Display information about triangle
        System.out.println(triangle.toString());
        System.out.println("Area: " + triangle.getArea());
        System.out.println("Perimeter: " + triangle.getPerimeter());
        System.out.println("Color: " + triangle.getColor());
        System.out.println("Filled: "  + triangle.isFilled());

        input.close();
    }
}
