package chapter4.s11;

public class Wrappers2 {

	public static void main(String[] args) {

		Integer sayi = new Integer(5);
		Integer sayi2 = 5;
		int sayi3 = 5;

		short kucukSayi = sayi.shortValue();

		Double buyukSayi = 260.68;

		byte b = buyukSayi.byteValue();

		String oniki = "3.14";

		double pi = Double.parseDouble(oniki);

		String sayi4 = sayi2.toString();

	}

}
