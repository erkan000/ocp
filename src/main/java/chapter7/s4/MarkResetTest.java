package chapter7.s4;

import java.io.*;

public class MarkResetTest {

	private static final String dosyaIsmi = "src/main/resources/files/file1.txt";

	public static void main(String args[]) throws IOException {
		
		BufferedReader br = new BufferedReader(new FileReader(dosyaIsmi));

		if(!br.markSupported()) {
			throw new IOException("I$aretleme desteklenmiyor..");
		}

		int b;
		while( ( b=br.read() ) != -1) {
			System.out.println(b +" > " + (char)b);
			if(b=='T') {
				br.mark(32);
			}
		}
		
		br.reset(); // geri sar
		System.out.println("Geri sariliyor ------- ");
		while( ( b=br.read() ) != -1) {
			System.out.println(b +"> " + (char)b);
		}

		br.close();
	}

}



