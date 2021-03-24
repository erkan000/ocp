package chapter2.s3.o1;

public enum Hesap {

	TOPLA {
		@Override
		double hesapla(int sayi1, int sayi2) {
			return sayi1 + sayi2;
		}
	},
	CIKAR {
		@Override
		double hesapla(int sayi1, int sayi2) {
			return sayi1 - sayi2;
		}
	},
	CARP {
		@Override
		double hesapla(int sayi1, int sayi2) {
			return sayi1 * sayi2;
		}
	},
	BOL {
		@Override
		double hesapla(int sayi1, int sayi2) {
			return sayi1 / (double)sayi2;
		}
	};

	abstract double hesapla(int sayi1, int sayi2);

}
