package chapter7.s3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import chapter7.s1.FileHelloWorld;

public class DosyaOkuYazByteArrayBuyukse {

	public static void main(String[] args) throws IOException {
		try (
				FileInputStream in = new FileInputStream(
						new File(FileHelloWorld.yol +  "data.txt" ));
				FileOutputStream out = new FileOutputStream(FileHelloWorld.yol + "DosyaOkuYazByteArrayBuyukse.java");
				)
		{
		
			int data;		
			byte[] byteArr = new byte[2048];
			while ((data = in.read(byteArr)) != -1) {
				out.write(byteArr);
			}
			
			// Bu örnekte küçük bir dosya büyük bir array kullanılarak kopyalanıyor.
			// Buradaki sorun 2048 lik bir array oluşturunca default değerler 0 oluyor.
			// dosya kopyalanıyor ama geride fazladan 0'lar oluşuyor!!
			
		}
	}
}
