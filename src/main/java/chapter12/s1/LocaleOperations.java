package chapter12.s1;

import java.util.Locale;

public class LocaleOperations {

	public static void main(String[] args) {
		// Builder örneği
		Locale.Builder builder = new Locale.Builder();
		builder.setLanguage("fr");
		builder.setRegion("CA");
		Locale locale = builder.build(); 

		
		Locale locale1 = Locale.FRENCH;
		Locale locale2 = Locale.FRANCE;
		Locale locale3 = new Locale.Builder().setLanguage("fr").build();
		Locale locale4 = new Locale.Builder().setLanguage("fr").setRegion("FR").build();
		Locale locale5 = new Locale("fr");
		Locale locale6 = new Locale("fr", "FR");
		
		System.out.println(locale1.equals(locale3));
		System.out.println(locale2.equals(locale6));
		System.out.println(locale4.equals(locale5));
		
		

	}

}
