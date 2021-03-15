package chapter7.s3;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import chapter7.s1.FileHelloWorld;

public class DataOkuYaz {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		try (
				FileOutputStream fos = new FileOutputStream(
						new File(FileHelloWorld.yol + "myData.data"));
				DataOutputStream dos = new DataOutputStream(fos);
				FileInputStream fis = new FileInputStream(FileHelloWorld.yol + "myData.data");
				DataInputStream dis = new DataInputStream(fis);
				) {
			dos.writeChars("OS");
			dos.writeInt(999);
			dos.writeDouble(45.8);
			dos.writeBoolean(true);
			dos.writeUTF("Will score 100%");
			System.out.println(dis.readChar());		// Her seferinde bir CHAR okuyor !
			System.out.println(dis.readChar());
			System.out.println(dis.readInt());
			System.out.println(dis.readDouble());
			System.out.println(dis.readBoolean());
			System.out.println(dis.readUTF());
			//System.out.println(dis.readBoolean());
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
