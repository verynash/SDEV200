/*
 * Name:    Zachary Barrett
 * Date:    01-24-2024
 * Program: myDate.java
 * Purpose: Test the myDate.java classes.
 */

public class testMyDate {
    public static void main(String[] args) {
        myDate noArgDate = new myDate();
        myDate longDate = new myDate(34355555133101L);

        System.out.println("First date: " + noArgDate.getMonth()
            + " " + noArgDate.getDay() + " " + noArgDate.getYear());
        
        System.out.println("Second date: " + longDate.getMonth()
        + " " + longDate.getDay() + " " + longDate.getYear());
    }
}
