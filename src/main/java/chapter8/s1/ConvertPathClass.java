package chapter8.s1;

import java.nio.file.Path;
import java.nio.file.Paths;

public class ConvertPathClass {
	
	public static void main(String[] args) {
		Path file = Paths.get("8-1.txt");
		Path path = file.toAbsolutePath();
		System.out.println(file.isAbsolute() + " \t " + file);
		System.out.println(path.isAbsolute() + " \t " + path);
		
		System.out.println("---");
		
		Path file2 = Paths.get("../8-1.txt");
		Path path3 = file2.toAbsolutePath();
		System.out.println(path3);
		System.out.println(path3.normalize());
		
		System.out.println("---");
		
		Path path2 = Paths.get("c:\\OCPJavaSE7\\..\\obj8\\.\\8-1.txt");
		System.out.println(path2.toString()); //line1
		System.out.println(path2.getName(1)); //line2
		System.out.println(path2.getParent()); //line3
		System.out.println(path2.subpath(2,4)); //line4

	}

}
