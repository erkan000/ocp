package chapter7.s3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import chapter7.s1.FileHelloWorld;

public class DosyayaIntYaz {
	
	// Bu örnekte write(int) fonksiyonu int sayının sadece son byte'ını dosyaya yazıyor!
	// diğer octet ler ignore ediliyor.

	public static void main(String[] args) throws IOException {
		try (
				OutputStream os = new FileOutputStream(FileHelloWorld.yol + "intYaz.txt");
				InputStream is = new FileInputStream(FileHelloWorld.yol + "intYaz.txt");
				) 
		{
			int i999 = 0b00000000_00000000_00000011_11100111;
			int i20 = 0b00000000_00000000_00000000_00010100;
			// sadece son byte yazılıyor 
			// 11100111 ve 00010100
			
			os.write(i999);
			os.write(i20);
			
			System.out.println(i999 + ":" + is.read());
			System.out.println(i20 + ":" + is.read());
		}
	}
}
