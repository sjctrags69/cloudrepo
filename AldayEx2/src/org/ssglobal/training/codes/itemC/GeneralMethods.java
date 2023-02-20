package org.ssglobal.training.codes.itemC;

public class GeneralMethods {

	public void powersOfTwo() {
		//this prints the title
		System.out.print("Powers of 2: ");
		//loop that computes and prints the result 
		for(byte i = 1; i <= 10; i++) {
			double a = Math.pow(2, i);
			//condition statement for format purposes
			if(i == 1) {
				System.out.print(a);
			} else {
				System.out.print(", " + a);
			}			
		}
	}
	
	public void alarm(int j) { //I tried passing byte instead of int but it doesn't accept it
		//loop that prints the number of alarm!
		for(byte i = 1; i <= j ; i++) {
			System.out.println("Alarm!");
		}
	}
	
	public int sum100() {
		//initialize values with their respective data type
		byte value = 100;
		int sum = 0;
		//loop that increments the sum
		for(int i = 1; i <= value; i++) {
			sum += i;
		}
		return sum;
	}
	
	public int sumRange(int firstValue, int secondValue) {
		//initialize return value
		int sum = 0;
		//loop that increments the sum
		for(int initial = firstValue; initial <= secondValue; initial++) {
			sum += initial;
		}
		return sum;
	}
	
	public int maxOfTwo(int firstValue, int secondValue) {
		//use of ternary operator to identify the bigger value while will be returned
		return (firstValue > secondValue) ? firstValue : secondValue;
	}
	
	public boolean larger(float firstValue, float secondValue) {
		return (firstValue > secondValue) ? true : false;
	}

	public boolean evenlyDivisible(int firstValue, int secondValue) {
		return (firstValue % secondValue == 0) ? true : false;
	}
}
