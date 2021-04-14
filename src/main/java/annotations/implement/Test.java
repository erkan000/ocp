package annotations.implement;

import java.text.DecimalFormat;

public class Test {
	public static void main(String[] args) {
		Kare kare = new Kare();
		Daire daire = new Daire();

		alanHesapla(kare);
		alanHesapla(daire);

		System.out.println("Karenin alanı : " + kare.getAlan());
		
		DecimalFormat fm = new DecimalFormat("#.##");
		System.out.println("Dairenin alanı : " + fm.format(daire.getAlan()));
		
	}
	
	
	static void alanHesapla(Object o) {
		Geometri geometri = o.getClass().getAnnotation(Geometri.class);

		if (geometri.sekil().equals("daire")) {
			double yaricap = geometri.cap() / 2.0;
			((Daire) o).setAlan(yaricap * yaricap * Math.PI);
		}

		if (geometri.sekil().equals("kare")) {
			double kenar = geometri.kenar();
			((Kare) o).setAlan(kenar * kenar);
		}

	}

	
}
