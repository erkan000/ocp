package chapter7.s5;

import java.io.*;

public class ConsoleInputStream {

	public static void main(String args[]) throws Exception{

		InputStream in = System.in;
		for(;;) {
			System.out.print("Lutfen Seciminizi Girin: 1|2|3 - C (CIKIS):");
			
			int okunan = new BufferedInputStream(in).read();
//			int okunan2 = new InputStreamReader(in).read();   // unicode!
			if(okunan == 49) {
				System.out.println("Bir");
			} else if(okunan == 50) {
				System.out.println("Iki");
			} else if(okunan == 51) {
				System.out.println("Uc");
			} else if(okunan == 67) {
				break;
			} else {
				System.out.print("Tanimsiz");
			}
		}
		
		System.out.print("Metin giriniz.");
		
		BufferedReader unicode = new BufferedReader(new InputStreamReader(in));
		String okunanSatir = unicode.readLine();
		System.out.println("Yazılan metin: " + okunanSatir);
		
		System.out.print("Uygulama Sonlanmistir");
		
	}
}
