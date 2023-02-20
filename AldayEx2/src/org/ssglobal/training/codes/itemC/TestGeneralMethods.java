package org.ssglobal.training.codes.itemC;

public class TestGeneralMethods {

	public static void main(String[] args) {
		GeneralMethods gm = new GeneralMethods();
		gm.powersOfTwo();
		gm.alarm(10);
		System.out.println("Sum of 1 to 100 is: " + gm.sum100());
		System.out.println("Sum of 12 to 98 is: " + gm.sumRange(12, 98));
		System.out.println("The larger value between 12 and 98 is: " + gm.maxOfTwo(12, 98));
		System.out.println("Is 98.8 greater than 98? : " + gm.larger(98.8F, 98.0F));
		System.out.println("Is 98 evenly divisble by 4? : " + gm.evenlyDivisible(98, 4));
	}

}
