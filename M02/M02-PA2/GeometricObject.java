/*
 * Name:    Zachary Barrett
 * Date:    01-25-2024
 * Program: GeometricObject.java
 * Purpose: Create a superclass GeometricObject to use for testing
 *          subclasses, in this case Triangle.java.
 */

public class GeometricObject {
    // Initialize variables with default values
    private String color = "white";
    private boolean filled;

    // Default no-arg constructor
    public GeometricObject() {
    }

    // Constructor using a String color and boolean for filled or not
    public GeometricObject(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    // Getter for color
    public String getColor() {
        return color;
    }

    // Getter for filled
    public boolean isFilled() {
        return filled;
    }

    // Setter for color
    public void setColor(String color) {
        this.color = color;
    }

    // Setter for filled
    public void setFilled(boolean filled) {
        this.filled = filled;
    }
}
