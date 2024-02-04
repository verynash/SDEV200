/*
 * Name:    Zachary Barrett
 * Date:    02-04-2024
 * Program: TestCircleComparable.java
 * Purpose: Test the class Circle.java.
 */

 public class TestCircleComparable {
    public static void main(String[] args) {
        Circle circle1 = new Circle(1);
        Circle circle2 = new Circle(1);
        Circle circle3 = new Circle(2);

        System.out.println("Circle1 has a radius of " + circle1.getRadius());
        System.out.println("Circle2 has a radius of " + circle2.getRadius());
        System.out.println("Circle3 has a radius of " + circle3.getRadius());

        boolean oneToTwo = circle1.equals(circle2);
        boolean oneToThree = circle1.equals(circle3);

        System.out.println("Circle1 is equal to Circle2: " + oneToTwo);
        System.out.println("Circle1 is equal to Circle3: " + oneToThree);
    }
}
