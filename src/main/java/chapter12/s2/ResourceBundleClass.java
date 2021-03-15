package chapter12.s2;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleClass {

	public static void main(String[] args) {
//		Locale locale = new Locale("hi", "IN");
		Locale locale = Locale.CANADA_FRENCH;
		ResourceBundle labels = ResourceBundle.getBundle("resource-bundle.IndianArtLabelsBundle", locale);
		String text = null;
		text = labels.getString("total_bookings");
		System.out.println(text);
		text = labels.getString("when");
		System.out.println(text);
		text = labels.getString("price");
		System.out.println(text);
		text = labels.getString("book_now");
		System.out.println(text);

	}

}
