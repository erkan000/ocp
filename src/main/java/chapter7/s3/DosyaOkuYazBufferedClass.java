package chapter7.s3;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import chapter7.s1.FileHelloWorld;

public class DosyaOkuYazBufferedClass {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		try (
				FileInputStream in = new FileInputStream(FileHelloWorld.yol + "jls7.pdf");
				FileOutputStream out = new FileOutputStream(FileHelloWorld.yol + "jls7-copy.pdf");
				BufferedInputStream bis = new BufferedInputStream(in);
				BufferedOutputStream bos = new BufferedOutputStream(out);
				)
		{
			long start = System.currentTimeMillis();
			int data;
			while ((data = bis.read()) != -1) {
				bos.write(data);
			}
			long end = System.currentTimeMillis();
			System.out.println("MilliSeconds elapsed : " + (end-start));
		}

	}

}
