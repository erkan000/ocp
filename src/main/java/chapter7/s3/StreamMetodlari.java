package chapter7.s3;

import java.io.*;

public class StreamMetodlari {

	private static final String dosyaIsmi = "src/main/resources/files/file1.txt";

	public static void main(String args[]) throws IOException {
		
		BufferedReader br = new BufferedReader(new FileReader(dosyaIsmi));

		if(!br.ready()) {
			throw new IOException("Henuz okunmaya hazir degil");
		}
		br.close();

		InputStream is = new FileInputStream("/JavaFileTest/dene.txt"); //Dikkat
		int okunabilecekByteSayisi = is.available();
		System.out.println("okunabilecekByteSayisi = " + okunabilecekByteSayisi);
		
		int b;
		while( (b = is.read()) != -1 ) {
			is.skip(1);	// 1 baytlik atlama
			System.out.println(b + "-" + (char)b );
		}
		is.close();

		
	}

}



