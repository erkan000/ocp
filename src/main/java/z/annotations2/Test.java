package z.annotations2;

import java.text.DecimalFormat;

public class Test {
	public static void main(String[] args) {
		Kare kare = new Kare();
		Daire daire = new Daire();

		GeometriHesabi.alanHesapla(kare);
		GeometriHesabi.alanHesapla(daire);

		System.out.println("Karenin alan� : " + kare.getAlan());
		
		DecimalFormat fm = new DecimalFormat("#.##");
		System.out.println("Dairenin alan� : " + fm.format(daire.getAlan()));
		
	}
}
