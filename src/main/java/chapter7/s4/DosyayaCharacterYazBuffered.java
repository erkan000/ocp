package chapter7.s4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import chapter7.s1.FileHelloWorld;

public class DosyayaCharacterYazBuffered {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {

		try (
				FileReader fr = new FileReader(FileHelloWorld.yol + "BufferedReaderWriter.java");
				BufferedReader br = new BufferedReader(fr);
				FileWriter fw = new FileWriter(FileHelloWorld.yol + "Copy.java");
				BufferedWriter bw = new BufferedWriter(fw);
				){
			String line = null;
			// Son satır null ile kontrol ediliyor!!!
			// diğerlerinden farklı !
			while ((line = br.readLine())!= null) {
				bw.write(line);
				bw.newLine();
			}
		}
		catch (IOException ioe) {
			System.out.println (ioe);
		}

	}

}

