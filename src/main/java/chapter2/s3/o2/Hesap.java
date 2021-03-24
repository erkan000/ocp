package chapter2.s3.o2;

public enum Hesap {

	TOPLA {
		@Override
		double hesapla(int sayi1, int sayi2) {
			return sayi1 + sayi2 + sayi1;
		}
	},
	CIKAR, CARP, BOL;

	double hesapla(int sayi1, int sayi2) {
		double sonuc = 0.0;
		if (this == Hesap.BOL) {
			sonuc = sayi1 / (double) sayi2;
		} else if (this == Hesap.CARP) {
			sonuc = sayi1 * sayi2;
		} else if (this == Hesap.CIKAR) {
			sonuc = sayi1 - sayi2;
		} else if (this == Hesap.TOPLA) {
			sonuc = sayi1 + sayi2;
		}
		return sonuc;
	}

}
