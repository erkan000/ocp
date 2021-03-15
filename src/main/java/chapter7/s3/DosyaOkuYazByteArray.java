package chapter7.s3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import chapter7.s1.FileHelloWorld;

public class DosyaOkuYazByteArray {

	public static void main(String[] args) throws IOException {
		try (
				FileInputStream in = new FileInputStream(
						new File(FileHelloWorld.yol + "input.pdf"));
				FileOutputStream out = new FileOutputStream(FileHelloWorld.yol + "outputByteArray.pdf");
				)
		{
			int data;
			byte[] byteArr = new byte[1024];
			while ((data = in.read(byteArr)) != -1) {
				out.write(byteArr, 0, data);
			}
		}
	}

}
