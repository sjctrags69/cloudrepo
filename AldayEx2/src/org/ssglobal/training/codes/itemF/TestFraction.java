package org.ssglobal.training.codes.itemF;

public class TestFraction {

	public static void main(String[] args) {
		Fraction f1 = new Fraction();
		Fraction f2 = new Fraction();
		
		f1.getNumerator(2);
	    f1.getDenominator(3);
	    f2.getNumerator(3);
	    f2.getDenominator(4);
	    
	    System.out.println("The value of f1 is: " + f1.printRational());
	    System.out.println("The value of f2 is: " + f2.printRational());
	    System.out.println("---------------------------------------");
	    System.out.println(f1.printRational() + " + " + f2.printRational() + " = " + f1.add(f2).printRational());
	    System.out.println("---------------------------------------");
	    System.out.println(f1.printRational() + " * " + f2.printRational() + " = " + f1.multiply(f2).printRational());
	    System.out.println("---------------------------------------");
	    System.out.println("Is " + f1.printRational() + " bigger than " + f2.printRational() + "? : " + f1.greaterEqual(f2));
	    
	}

}
