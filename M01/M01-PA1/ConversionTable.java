/* 
 * Name:    Zachary Barrett
 * Date:    01-19-2024
 * Program: ConversionTable.java
 * Purpose: Create a table that converts feet to meters and vice versa.
*/

public class ConversionTable {
    public static void main(String[] args) {
        // Create table headings
        System.out.println("Feet        Meters       |    Meters      Feet    ");
        System.out.println("--------------------------------------------------");

        
        // Initialize table data
        final int NUMBER_OF_DATA_ROWS = 10;
        double foot = 1.0;
        double meter = 20.0;
        
        // Create table data and print
        for (int i = 0; i < NUMBER_OF_DATA_ROWS; i++) {
            // Print table data using footToMeter and meterToFoot
            System.out.printf("%4.1f        %4.3f        |    %3.1f        %6.3f\n", 
                            foot, 
                            footToMeter(foot), 
                            meter, 
                            meterToFoot(meter));

            foot = foot + 1;
            meter = meter + 5;
        }

    }

    // Converts feet to meters
    public static double footToMeter(double foot) {
        return foot * 0.305;
    }

    // Converts meters to feet
    public static double meterToFoot(double meter) {
        return meter * 3.279;
    }
}
