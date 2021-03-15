package chapter12.s3;

import java.text.NumberFormat;

public class FormatNumbers2 {
	public static void main(String[] args) {
		double num = 3.647342;
		NumberFormat nfDefault = NumberFormat.getPercentInstance();
		msg(nfDefault.format(num));		
		
		nfDefault = NumberFormat.getCurrencyInstance();
		msg(nfDefault.format(num));
		
		nfDefault = NumberFormat.getIntegerInstance();
		msg(nfDefault.format(num));
		
		nfDefault = NumberFormat.getNumberInstance();
		msg(nfDefault.format(num));
		
	}
	
	static void msg(String str) { System.out.println(str); }
}