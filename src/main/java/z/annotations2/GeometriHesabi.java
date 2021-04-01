package z.annotations2;

public class GeometriHesabi {

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
