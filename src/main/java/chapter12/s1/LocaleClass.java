package chapter12.s1;

import java.util.Locale;

public class LocaleClass {

	public static void main(String[] args) {
		Locale fr = new Locale("olmayanBolge");
		System.out.println(fr.getDisplayName());
		// olmayan bir dilde Hata fırlatmaz!
		
		fr = Locale.getDefault();
		System.out.println(fr.getDisplayName());
		
		fr = Locale.ITALY;
		System.out.println(fr.getDisplayName());
		System.out.println("Region = " + fr.getDisplayCountry());
		
		// Bu şekilde tanımda(Dil sabiti ile) Region tanımsızdır.
		fr = Locale.ITALIAN;
		System.out.println(fr.getDisplayName());
		System.out.println("Region = " + fr.getDisplayCountry());
	}

}
