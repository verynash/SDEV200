/*
 * Name:    Zachary Barrett
 * Date:    01-20-24
 * Program: RegularPolygon.java
 * Purpose: This program contains variables and
 *          methods for creating a regular
 *          polygon.
 */

public class RegularPolygon {
    private int n;
    private double side;
    private double x;
    private double y;

    RegularPolygon() {
        n = 3;
        side = 1.0;
        x = 0.0;
        y = 0.0;
    }

    RegularPolygon(int numSides, double sideLength) {
        n = numSides;
        side = sideLength;
        x = 0;
        y = 0;
    }

    RegularPolygon(int numSides, double sideLength, double xCoordinate, double yCoordinate) {
        n = numSides;
        side = sideLength;
        x = xCoordinate;
        y = yCoordinate;
    }

    public void setN(int numSides) {
        n = numSides;
    }

    public void setSide(double sideLength) {
        side = sideLength;
    }

    public void setX(double xCoordinate) {
        x = xCoordinate;
    }

    public void setY(double yCoordinate) {
        y = yCoordinate;
    }

    public int getN() {
        return n;
    }

    public double getSide() {
        return side;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getPerimeter() {
        double perimeter = n * side;
        return perimeter;
    }

    public double getArea() {
        double area = (n * side * side) / (4 * Math.tan(Math.PI / n));
        return area;
    }




}
