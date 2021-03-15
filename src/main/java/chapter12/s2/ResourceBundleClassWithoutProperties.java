package chapter12.s2;

import java.util.ListResourceBundle;
import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleClassWithoutProperties {

	public static void main(String[] args) {
		Locale locale = new Locale("hi", "IN");
		//Locale locale = Locale.CANADA_FRENCH;
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


class IndianArtLabelsBundle2 extends ListResourceBundle{
	protected Object[][] getContents() {
		return new Object[][] {
			{"total_bookings", "Total Bookings"},
			{"when", "When"},
			{"price", "Price"},
			{"book_now", "Book Now"},
			{"sample_art", "flag_fish.png"},
		};
	}
}

class IndianArtLabelsBundle2_fr extends ListResourceBundle{
	protected Object[][] getContents() {
		return new Object[][] {
			{"total_bookings", "Réservations totales"},
			{"when", "Lors de"},
			{"price", "Prix"},
			{"book_now", "Réserver"},
			{"sample_art", "flag_mango_oval.png"},
		};
	}
}


class IndianArtLabelsBundle2_hi_IN extends ListResourceBundle{
	protected Object[][] getContents() {
		return new Object[][] {
			{"total_bookings", "\u0915\u0941\u0932\u092C\u0941\u0915\u093f\u0902\u0917"},
				{"when", "\u0915\u092c"},
				{"price", "\u0915\u0940\u092e\u0924"},
				{"book_now", "\u0905\u092D\u0940 \u092C\u0941\u0915\u0915\u0930\u0947\u0902"},
					{"sample_art", "mango_stripes.png"},
				};
			}
		}
