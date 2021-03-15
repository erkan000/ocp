package chapter8.s2;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class CopyFiles {
	
	private static final String klasor = "src/main/resources/files/";

	public static void main(String[] args) throws IOException {
		Path source = Paths.get(klasor + "file1.txt");
		Path target = Paths.get(klasor + "copiedFile.txt");
		Path aab = Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);

		byte[] bytes = Files.readAllBytes(target);
		String aa = new String(bytes, Charset.defaultCharset());
		System.out.println(aa);

		System.out.println("-------");

//		CTRL+Z ile end of line belirtiliyor.
		try (InputStream in = System.in){
			Path target2 = Paths.get(klasor + "myNotesFromConsole.txt");
			Files.copy(in, target2, StandardCopyOption.REPLACE_EXISTING);
		}
		catch (IOException ioe) {
			System.out.println(ioe);
		}
		
		System.out.println("-------");
		
		try (OutputStream out = new FileOutputStream(klasor + "copiedFile2.txt")){
			Path source3 = Paths.get(klasor + "file1.txt");
			Files.copy(source3, out);
		}
		catch (IOException ioe) {
			System.out.println(ioe);
		}

	}

}
