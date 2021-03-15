package chapter7.s2;

import java.io.File;
import java.io.IOException;

import chapter7.s1.FileHelloWorld;

public class FileOlustur {

	public static void main(String[] args) throws IOException {
		
		// Aşağıdaki satır workspace'in bulunduğu diskin root klasörüne oluşturuluyor.		
		File dirs = new File(FileHelloWorld.yol + "usr\\code\\java");
		System.out.println(dirs.mkdirs());

		File file = new File(dirs, "MyText.txt");
		if (!file.exists())
			System.out.println(file.createNewFile());

	}

}
