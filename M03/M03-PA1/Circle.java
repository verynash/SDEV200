/*
 * Name:    Zachary Barrett
 * Date:    02-04-2024
 * Program: Circle.java
 * Purpose: Create a class Circle that extends GeometricObject and
 *          implements Comparable.
 */

 public class Circle extends GeometricObject implements Comparable<Circle> {
    private double radius;
  
    public Circle() {
    }
  
    public Circle(double radius) {
      this.radius = radius;
    }
  
    /** Return radius */
    public double getRadius() {
      return radius;
    }
  
    /** Set a new radius */
    public void setRadius(double radius) {
      this.radius = radius;
    }
  
    @Override /** Return area */
    public double getArea() {
      return radius * radius * Math.PI;
    }
  
    /** Return diameter */
    public double getDiameter() {
      return 2 * radius;
    }
  
    @Override /** Return perimeter */
    public double getPerimeter() {
      return 2 * radius * Math.PI;
    }
  
    // Test whether objects have equal radii
    @Override public boolean equals(Object o) {
      return this.compareTo((Circle)o) == 0;
    }

    // Use compareTo() method to return values for equals()
    @Override public int compareTo(Circle o) {
      if (this.radius > o.radius)
        return 1;
      else if (this.radius < o.radius)
        return -1;
      else
        return 0;
    }

    /* Print the circle info */
    public void printCircle() {
      System.out.println("The circle is created " + getDateCreated() +
        " and the radius is " + radius);
    }
  
    @Override /** Return a string representation of a Circle object */
    public String toString() {
      return super.toString() + " radius: " + radius;
    }
  }
  