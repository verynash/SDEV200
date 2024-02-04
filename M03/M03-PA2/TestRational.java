/*
 * Name:    Zachary Barrett
 * Date:    02-04-2024
 * Program: TestRational.java
 * Purpose: Test Rational.java.
 */

 import java.math.*;
import java.util.*;

public class TestRational {
  public static void main(String[] args) {
    // Prompt for two rational numbers
    Scanner input = new Scanner(System.in);
    System.out.println("Enter first rational number: ");
    BigInteger numerator1 = BigInteger.valueOf(input.nextInt());
    BigInteger denominator1 = BigInteger.valueOf(input.nextInt());
    System.out.println("Enter second rational number: ");
    BigInteger numerator2 = BigInteger.valueOf(input.nextInt());
    BigInteger denominator2 = BigInteger.valueOf(input.nextInt());


    Rational rational1 = new Rational(numerator1, denominator1);
    Rational rational2 = new Rational(numerator2, denominator2);

    // Display results
    System.out.println(rational1 + " + " + rational2 + " = " + rational1.add(rational2));
    System.out.println(rational1 + " - " + rational2 + " = " + rational1.subtract(rational2));
    System.out.println(rational1 + " * " + rational2 + " = " + rational1.multiply(rational2));
    System.out.println(rational1 + " / " + rational2 + " = " + rational1.divide(rational2));
    System.out.println(rational2 + " is " + rational2.doubleValue());

    input.close();
  }
}
