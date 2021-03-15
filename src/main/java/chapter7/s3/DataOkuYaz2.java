package chapter7.s3;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import chapter7.s1.FileHelloWorld;

public class DataOkuYaz2 {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		try (
				FileOutputStream fos = new FileOutputStream(
						new File(FileHelloWorld.yol + "myData3.data"));
				DataOutputStream dos = new DataOutputStream(fos);
				FileInputStream fis = new FileInputStream(FileHelloWorld.yol + "myData3.data");
				DataInputStream dis = new DataInputStream(fis);
				) {
			
			dos.writeUTF("ERK45678909876543212");
			dos.close();
			fos.close();

		}
		
		// byte 1 byte
		// char 2 byte
		// short 2 byte
		// int	4 byte
		// boolean 1 byte
		// float 4 byte
		// double 8 byte
		// long 8 byte
		

	}

}
