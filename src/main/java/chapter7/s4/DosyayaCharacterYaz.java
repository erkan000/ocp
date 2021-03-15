package chapter7.s4;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import chapter7.s1.FileHelloWorld;

public class DosyayaCharacterYaz {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		
		try (
				FileReader input = new FileReader(FileHelloWorld.yol + "ReadChars.java");
				FileWriter output = new FileWriter(FileHelloWorld.yol + "CopyReadChars.java");
				)
		{
			int data;
			while ((data = input.read()) != -1) {
				output.write(data);
			}
		}
	}

}

