package chapter12.s1;

import java.util.Locale;

public class LocaleClass {

	public static void main(String[] args) {
		Locale fr = new Locale("olmayanBolge");
		System.out.println("X: " + fr);
		// olmayan bir dilde Hata fırlatmaz!

		fr = Locale.getDefault();
		System.out.println("Default: " + fr);

		fr = Locale.ITALY;
		System.out.println("Locale.ITALY: " + fr);

		// Bu şekilde tanımda(Dil sabiti ile) Region tanımsızdır.
		fr = Locale.ITALIAN;
		System.out.println("Locale.ITALIAN: " + fr);

		Locale l1 = new Locale.Builder()
				.setLanguage("tr")
				.setRegion("TR")
				.build();
		System.out.println(l1);
	}

}
