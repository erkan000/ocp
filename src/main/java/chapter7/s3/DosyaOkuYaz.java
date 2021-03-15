package chapter7.s3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import chapter7.s1.FileHelloWorld;

public class DosyaOkuYaz {

	public static void main(String[] args) throws IOException {
		try (
				FileInputStream in = new FileInputStream(FileHelloWorld.yol + "input.pdf");
				FileOutputStream out = new FileOutputStream(FileHelloWorld.yol + "Sample2.pdf");
				)
		{
			long start = System.currentTimeMillis();
			
			int data;
			while ((data = in.read()) != -1) {
				out.write(data);
				out.flush();
				//System.out.println(data);
			}
			
			long end = System.currentTimeMillis();
			System.out.println("MilliSeconds elapsed : " + (end-start));
		}		

	}

}
