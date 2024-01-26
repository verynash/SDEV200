import java.util.Scanner;

public class TestBin2Dec {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        String binary = input.nextLine();

        try {
            System.out.println(BinaryToDecimal.bin2Dec(binary));
        }
        catch (NumberFormatException ex) {
            System.out.println(ex.getMessage());
        }

        input.close();
    }
}
