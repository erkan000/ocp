package chapter8.s1;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Relativite {
	
	public static void main(String[] args) {
		Path dir = Paths.get("code");
		Path file = Paths.get("code/java/IO.java");		
		System.out.println(file.relativize(dir));
		System.out.println(dir.relativize(file));
		
		dir = Paths.get("/code");
		file = Paths.get("/java/IO.java");
		System.out.println(file.relativize(dir));
		System.out.println(dir.relativize(file));
	}

}
