package chapter12.s3;

import java.util.Locale;
import java.text.NumberFormat;
public class FormatCurrency {
	public static void main(String[] args) {
		double amt = 12345.1111;
		defaultLocale(amt);
		specificLocale(Locale.UK, amt);
		specificLocale(Locale.GERMANY, amt);
		specificLocale(Locale.FRANCE, amt);
		specificLocale(Locale.US, amt);
		specificLocale(Locale.JAPAN, amt);
	}
	static void defaultLocale(double num) {
		NumberFormat nfDefault = NumberFormat.getCurrencyInstance();
		msg("\nDefault Locale Currency:"+nfDefault.getCurrency());
		msg("formatted amt: " + nfDefault.format(num));
	}
	static void specificLocale(Locale locale, double num) {
		NumberFormat nfSpec = NumberFormat.getCurrencyInstance(locale);
		msg("\n"+locale.getDisplayCountry()+
				" Currency:"+nfSpec.getCurrency());
		msg("formatted amt: " + nfSpec.format(num));
	}
	static void msg(String str) { System.out.println (str); }
}