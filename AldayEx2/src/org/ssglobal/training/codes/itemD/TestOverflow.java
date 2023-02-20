package org.ssglobal.training.codes.itemD;

public class TestOverflow {

	public static void main(String[] args) {
		Overflow of = new Overflow();
		byte firstNum = -120, secondNum = -8;
		System.out.println(of.sumOverflow(firstNum, secondNum));
	}

}
