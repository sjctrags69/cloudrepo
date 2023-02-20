package org.ssglobal.training.codes.itemF;

public class Fraction {
	
	public int numerator, denominator, LcommonD;
	
	public int getNumerator(int n) {
		numerator = n;
		return this.numerator;
	}
	
	public int getDenominator(int d) {
		denominator = d;
		return this.denominator;
	}
	
	public String printRational() {
		String strValue = numerator + "/" + denominator;
		return strValue;
	}
	
	public Fraction add(Fraction f2) {
		
	      try {
	    	//set the initial value of Lowest Common Denominator as the first denominator
	    	  LcommonD = denominator;
		      while (LcommonD % f2.denominator != 0) {
		    	  LcommonD += LcommonD;
		      }
	      } catch (ArithmeticException e) {
	    	  System.out.println("Denominator can't be 0");
	      }
	      
		  //New Value for f1
	      int NWnum1 = f2.denominator * numerator;
	      
	      //New Value for f2
	      int NWnum2 = denominator * f2.numerator;
	      	      
	      //set up for a new Fraction that will carry the sum of both
	      Fraction sum = new Fraction();
	      sum.numerator = NWnum1 + NWnum2;
	      sum.denominator = LcommonD;
	      return sum;
	}
	
	public Fraction multiply(Fraction f2) {
		
		try {
			if(denominator == 0 || f2.denominator == 0) {
				System.out.println("Kindly enter a different denmoniator");
			}
		} catch (ArithmeticException e) {
			System.out.println("Denominator can't be 0");
		}
		//set up for a new Fraction that will carry the product of both
	    Fraction product = new Fraction();
	    product.numerator = numerator * f2.numerator;
	    product.denominator = denominator * f2.denominator;
		return product;
	}
	
	public boolean greaterEqual(Fraction f2) {
		int Y = (numerator * f2.denominator) - (denominator * f2.numerator);
		return (Y > 0) ? true : false;
	}
	
}
