package chapter12.s1;

import java.util.Locale;

public class LocaleMethods {
	public static void main(String[] args) {
		msg("Default Locale:"+Locale.getDefault());
		Locale.setDefault(Locale.ITALY);
		
		Locale[] all = Locale.getAvailableLocales();
		for (Locale locale : all) {
			//System.out.println(locale);
		}
		Locale loc = Locale.getDefault();
		msg("Code Country:"+loc.getCountry());
		msg("Code Language:"+loc.getLanguage());
		msg("Display Country:"+loc.getDisplayCountry());
		msg("Display Language:"+loc.getDisplayLanguage());
		msg("Display Name:"+loc.getDisplayName());

	}

	static void msg(String str) { System.out.println (str);

	}
}
