package org.ssglobal.training.codes.itemA;

public class BadNews {
	public static int MAX_ODD = 21;
	public static void writeOdds() {
		int count = 1;
		// print each odd number
		for (count = 1; count <= (MAX_ODD - 2); count++) {

			System.out.print(count + " ");
			count = count + 1;
		}
		
		// print the last odd number
		System.out.println(count);
	}
	public static void main(String[] args) {
		// write all odds up to 21
		writeOdds();
		// now, write all odds up to 11
		MAX_ODD = 11;
		writeOdds();
	}
}