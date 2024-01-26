/*
 * Name:    Zachary Barrett
 * Date:    01-26-2024
 * Program: BinaryToDecimal.java
 * Purpose: Create class bin2Dec that returns a long (int prevents 
 *          large numbers from being input) and throws a 
 *          BinaryFormatException if the argument is not a 
 *          binary number.
 */

public class BinaryToDecimal {
    public static long bin2Dec(String binary) throws BinaryFormatException {
        // Initialize variables
        long bin = Long.parseLong(binary);
        long decimal = 0;
        long base = 1;
        long temp = bin;
        
        // Calculate decimal value
        while (temp > 0) {
            long lastNumber = temp % 10; // Get final digit
            // Throw error if last digit is not 0 or 1 (not binary)
            if (lastNumber < 0 || lastNumber > 1) {
                throw new BinaryFormatException(binary);
            }
            temp = temp / 10; // Remove last digit
            // Increase decimal value  
            decimal += lastNumber * base; 
            base = base * 2;
        }
        return decimal;
    } 
}
