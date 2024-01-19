/*
 * Name:    Zachary Barrett
 * Date:    01-29-24
 * Program: ValidateCreditCard.java
 * Purpose: This program will accept a credit card number and
 *          determine whether it is valid.
 */

 import java.util.*;

public class ValidateCreditCard {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a credit card number: ");
        long cardNumber = input.nextLong();

        if (isValid(cardNumber)) {
            System.out.println(cardNumber + " is valid.");
        } else {
            System.out.println(cardNumber + " is invalid.");
        }
        
        input.close();
    }
    
    // Return number of digits in d
    public static int getSize(long d) {
        String numberString = d + ""; // Convert card number to string
        return numberString.length(); // Return card number length
    }
    
    // Return the first k number of digits from number.
    // If the number of digits in number is less than k, 
    // return number.
    public static long getPrefix(long number, int k) {
        if (getSize(number) > k) {
            String numberString = number + "";
            String numberSubString = numberString.substring(0, k);
            long longSubString = Long.parseLong(numberSubString);
            return longSubString;
        }
        return number;
    }

    // Return true if the number d is a prefix for the card number
    public static boolean prefixMatched(long number, int d) {
        long prefix = getPrefix(number, getSize(d));
        if (prefix == d) {
            return true;
        } else {
            return false;
        }
    }

    // Return this number if it is a single digit, otherwise
    // return the sum of the two digits
    public static int getDigit(int number) {
        if (number <= 9) {
            return number;
        }
            else {
                String numberString = number + "";
                int num1 = Integer.parseInt(numberString.charAt(0) + ""); // Access first number
                int num2 = Integer.parseInt(numberString.charAt(1) + ""); // Access second  number
                int sum = num1 + num2;
                return sum;
            }
        }
        
    // Get sum of double the even place values
    public static int sumOfDoubleEvenPlace(long number) {
        int sum = 0;
        String numberString  = number + "";
        int i;
        for (i = getSize(number) - 2; i >= 0; i = i - 2) {
            int num = getDigit(Integer.parseInt(numberString.charAt(i) + "") * 2);
            sum += num;
        }
        return sum;
    }
    
    // Return sum of odd-place digits in number
    public static int sumOfOddPlace(long number) {
        int sum = 0;
        String numberString  = number + "";
        int i;
        for (i = getSize(number) - 1; i >= 0; i = i - 2) {
            int num = Integer.parseInt(numberString.charAt(i) + "");
            sum += num;
        }
        return sum;
    }
    
    // Return true if card number is valid
    public static boolean isValid(long number) {
    
        // Check for valid length and starting numbers
        if (getSize(number) > 16 || getSize(number) < 13)
            return false; // Card has invalid length
    
        if (!(prefixMatched(number, 4) ||
            prefixMatched(number, 5) ||
            prefixMatched(number, 6) ||
            prefixMatched(number, 37))) {
                return false; // Card has invalid starting numbers
            }

        if ((sumOfDoubleEvenPlace(number) + sumOfOddPlace(number)) % 10 != 0) {
            return false;
        }
    
        return true; // Card is valid
    }       
}
