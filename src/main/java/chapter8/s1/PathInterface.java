package chapter8.s1;

import java.io.File;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathInterface {
	
	public static void main(String[] args) {
		Path p1 = Paths.get("a.txt");
		Path p2 = FileSystems.getDefault().getPath("a.txt");
		Path p3 = new File("a.txt").toPath();
//		Hata vermezler, dosya sistemine bakmıyor Path interface'i
	
		Path p4 = Paths.get("chapter7_temp","data.txt");
//		İç içe klasörler varargs olarak geçilebilir.
	}

}
