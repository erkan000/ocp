package chapter12.s3;

import java.util.Locale;
import java.text.NumberFormat;

public class FormatNumbers {
	public static void main(String[] args) {
		double num = 12345.1111;
		defaultLocale(num);
		specificLocale(Locale.GERMANY, num);
		specificLocale(Locale.FRANCE, num);
		specificLocale(Locale.US, num);
	}
	static void defaultLocale(double num) {
		NumberFormat nfDefault = NumberFormat.getInstance();
		msg("\nDefault Locale " + Locale.getDefault());
		msg("formatting: " + nfDefault.format(num));
		try {
			msg("parsing : " + nfDefault.parse("12345,1111"));
		}
		catch (java.text.ParseException e) {
			msg(e.toString());
		}
	}
	static void specificLocale(Locale locale, double num) {
		NumberFormat nfSpecific = NumberFormat.getInstance(locale);
		msg("\n"+locale.getDisplayCountry());
		msg("formatting: " + nfSpecific.format(num));
		try {
			msg("parsing : " + nfSpecific.parse("12345.1111"));
		}
		catch (java.text.ParseException e) {
			msg(e.toString());
		}
	}
	static void msg(String str) { System.out.println(str); }
}