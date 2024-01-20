/*
 * Name:    Zachary Barrett
 * Date:    01-20-24
 * Program: TestRegularPolygon.java
 * Purpose: This program tests the class RegularPolygon in the
 *          file RegularPolygon.java.
 */

public class TestRegularPolygon {
    public static void main(String[] args) {
        RegularPolygon noArgRegularPolygon = new RegularPolygon();
        RegularPolygon nSideRegularPolygon = new RegularPolygon(6, 4);
        RegularPolygon nSideXYRegularPolygon = new RegularPolygon(10, 4, 5.6, 7.8);

        System.out.printf("The 1st polygon's perimeter is %.2f "
                + "and it's area is %.2f.\n",
                noArgRegularPolygon.getPerimeter(),
                noArgRegularPolygon.getArea());
        System.out.printf("The 2nd polygon's perimeter is %.2f "
                + "and it's area is %.2f.\n",
                nSideRegularPolygon.getPerimeter(),
                nSideRegularPolygon.getArea());
        System.out.printf("The 3rd polygon's perimeter is %.2f "
                + "and it's area is %.2f.",
                nSideXYRegularPolygon.getPerimeter(),
                nSideXYRegularPolygon.getArea());
    }
}
