/*
 * Name:    Zachary Barrett
 * Date:    01-24-2024
 * Program: myDate.java
 * Purpose: Create a class that displays a date based on user input
 *          and uses default values if no input is entered.
 */

import java.util.*;

public class myDate {
    // Initialize variables
    private int year;
    private int month;
    private int day;

    // Create myDate object for current date, with no
    // specified values.
    myDate() {
        GregorianCalendar calendar = new GregorianCalendar();
        year = calendar.get(GregorianCalendar.YEAR);
        month = calendar.get(GregorianCalendar.MONTH);
        day = calendar.get(GregorianCalendar.DAY_OF_MONTH);
    }

    // Create myDate object using elapsed time  in  ms since
    // January 1, 1970.
    myDate(long elapsedTime) {
        setDate(elapsedTime);
    }

    // Create myDate object using specified values
    myDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    // Return year
    public int getYear() {
        return year;
    }

    // Return month
    public String getMonth() {
        String m = String.valueOf(month + 1);
        return m;
    }

    // Return day
    public String getDay() {
        String d = String.valueOf(day);
        return d;
    }

    public void setDate(long elapsedTime) {
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.setTimeInMillis(elapsedTime);
        year = calendar.get(GregorianCalendar.YEAR);
        month = calendar.get(GregorianCalendar.MONTH);
        day = calendar.get(GregorianCalendar.DAY_OF_MONTH);
    }
}
