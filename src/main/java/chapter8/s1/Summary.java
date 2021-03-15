package chapter8.s1;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Summary {
	
	public static void main(String[] args) {
		Path dir = Paths.get("code");
		
		Path file = Paths.get("code/java/IO.java");
		Path relative = file.resolve(file.relativize(dir));
		Path absolute = relative.toAbsolutePath();
		System.out.println(relative);
		System.out.println(absolute);
	}

}
