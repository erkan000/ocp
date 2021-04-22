package chapter12.s3;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class DecimalFormatSample {
	
	public static void main(String[] args) {
		double d = 34567.467;
		NumberFormat f1 = new DecimalFormat("###,###,###.0");
		System.out.println(f1.format(d));

		NumberFormat f2 = new DecimalFormat("000,000,000.00000");
		System.out.println(f2.format(d));

		NumberFormat f3 = new DecimalFormat("$#,###,###.##");
		System.out.println(f3.format(d));
	}

}
