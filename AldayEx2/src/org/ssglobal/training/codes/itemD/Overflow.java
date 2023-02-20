package org.ssglobal.training.codes.itemD;

public class Overflow {
	
	public static boolean sumOverflow(byte x, byte y) {
		return (x + y == 127 || x + y == -128) ? true : false;
	}
}
