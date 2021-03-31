package chapter7.s5;

import java.io.*;

public class RandomAccessFileTest {

	public static void main(String[] args) throws IOException {
		// dosya sisteminde gerçekte dosyayı oluşturuyor!
		
		RandomAccessFile redDosya = new RandomAccessFile("/redtest.dat", "rw");
		redDosya.writeDouble(5.2398);
		redDosya.seek(50);
		redDosya.writeBoolean(true);
		redDosya.close();

		redDosya = new RandomAccessFile("redtest.dat", "r");
		System.out.println(redDosya.readDouble());
		redDosya.seek(50);
		System.out.println(redDosya.readBoolean());
		redDosya.close();
	}
}



