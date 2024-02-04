/*
 * Name:    Zachary Barrett
 * Date:    02-04-2024
 * Program: Rational.java
 * Purpose: Modify Rational class to implement comparable.
 */

 import java.math.*;

public class Rational extends Number implements Comparable<Rational> {
    // Data fields for numerator and denominator
    private BigInteger[] r = new BigInteger[2];

    /** Construct a rational with default properties */
    public Rational() {
      this(new BigInteger("0"), new BigInteger("1"));
    }

    // Construct a rational with specirfied properties
    public Rational(BigInteger numerator, BigInteger denominator) {
      BigInteger gcd = gcd(numerator, denominator);
      r[0] = numerator.divide(gcd);
      r[1] = denominator.divide(gcd);
    }
    
    // Get Greatest Common Denominator
    private static BigInteger gcd(BigInteger numerator, BigInteger denominator) {
      BigInteger num1 = numerator;
      BigInteger num2 = denominator;
      BigInteger gcd = BigInteger.ONE;
      
      for (BigInteger i = BigInteger.ONE; i.compareTo(num1) <= 0 && i.compareTo(num2) <= 0;
      i = i.add(BigInteger.ONE)) {
        if (num1.remainder(i).compareTo(BigInteger.ZERO) == 0 &&
        num2.remainder(i).compareTo(BigInteger.ZERO) == 0){
          gcd = i;
        }
      }
      return gcd;
    }
    
	/** Add a rational number to this rational */
	public Rational add(Rational secondRational) {
		BigInteger n = (r[0].multiply(secondRational.getDenominator())).add(
			r[1].multiply(secondRational.getNumerator()));
		BigInteger d = r[1].multiply(secondRational.getDenominator());
		return new Rational(n, d);
	}

	/** Subtract a rational number from this rational */
	public Rational subtract(Rational secondRational) {
		BigInteger n = (r[0].multiply(secondRational.getDenominator())).subtract(
			r[1].multiply(secondRational.getNumerator()));
		BigInteger d = r[1].multiply(secondRational.getDenominator());
		return new Rational(n, d);
	}

	/** Mulitply a rational number by this rational */
	public Rational multiply(Rational secondRational) {
		BigInteger n = r[0].multiply(secondRational.getNumerator());
		BigInteger d = r[1].multiply(secondRational.getDenominator());
		return new Rational(n, d);
	}

	/** Divide a rational number by this rational */
	public Rational divide(Rational secondRational) {
		BigInteger n = r[0].multiply(secondRational.getDenominator());
		BigInteger d = r[1].multiply(secondRational.getNumerator());
		return new Rational(n, d);
	}
    
    // Get numerator
    public BigInteger getNumerator() {
      return r[0];
    }

    // Get denominator
    public BigInteger getDenominator() {
      return r[1];
    }

    @Override // Override the equals method in the Object class
    public boolean equals(Object other) {
      if (((this.subtract((Rational)(other))).getNumerator()).compareTo(BigInteger.ZERO) == 0)
        return true;
      else
        return false;
    }
    
    @Override
    public String toString() {
      if (r[1].compareTo(BigInteger.ONE) == 0)
        return r[0] + "";
      else
        return r[0] + "/" + r[1];
    }

    @Override // Implement the abstract intValue method in Number
    public int intValue() {
      return (int)doubleValue();    
    }

    @Override // Implement the abstract floatValue method in Number
    public float floatValue() {
      return (float)doubleValue();
    }

    @Override // Implement the doubleValue method in Number
    public double doubleValue() {
      return this.getNumerator().doubleValue() / this.getDenominator().doubleValue();
    }

    @Override // Implement the abstract longValue method in Number
    public long longValue() {
      return (long)doubleValue();
    }

    @Override // Implement the compareTo method in Comparable
    public int compareTo(Rational o) {
      BigInteger zero = BigInteger.ZERO;
      BigInteger n = this.subtract((Rational)o).getNumerator();
      if (n.compareTo(zero) > 0)
        return 1;
      else if (n.compareTo(zero) < 0)
        return -1;
      else
        return 0;
    }
}