import java.util.Scanner;

public class TestBin2Dec {
    public static void main(String[] args) {
        // Initialize scanner and prompt for binary number
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        String binary = input.nextLine();

        // Try to convert binary number to a decimal number
        try {
            System.out.println(BinaryToDecimal.bin2Dec(binary));
        }
        // Throw NumberFormatException of type BinaryFormatException
        // if the number is not a binary number
        catch (NumberFormatException ex) {
            System.out.println(ex.getMessage());
        }

        input.close();
    }
}
