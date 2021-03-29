package chapter7.s1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileHelloWorld {
	
	public static final String yol = "src/main/resources/chapter7_temp/";

	public static void main(String[] args) throws FileNotFoundException {
		
		// Bu class sadece klasör yapısını anlamak için oluşturdum.
		
		// Aşağıdaki satır workspace'in bulunduğu diskin root klasörüne ilgili dosyayı arıyor!		
		FileInputStream in1 = new FileInputStream("/input.pdf");
		
		// Aşağıdaki satır ise java dosyasının ait olduğu projenin klasöründe ilgili dosyayı arıyor!		
		FileInputStream in2 = new FileInputStream("input.pdf");

	}

}
