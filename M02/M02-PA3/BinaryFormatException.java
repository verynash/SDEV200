/*
 * Name:    Zachary Barrett
 * Date:    01-26-2024
 * Program: BinaryFormatException.java
 * Purpose: Create a custom exception that extends the superclass
 *          object NumberFormatException.
 */


public class BinaryFormatException extends NumberFormatException {
    // Initialize variable
    private String binary;

    // Modify message for a BinaryFormatException
    public BinaryFormatException(String binary) {
        super(binary + " is not a binary string");
        this.binary = binary;
    }

    // Return binary string
    public String getBinary() {
        return binary;
    }
}
