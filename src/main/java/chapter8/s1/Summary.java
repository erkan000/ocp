package chapter8.s1;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Summary {
	
	public static void main(String[] args) {
		Path dir = Paths.get("code");		
		Path file = Paths.get("code/java/IO.java");
		Path tmp = file.relativize(dir);
		Path relative = file.resolve(tmp);
		Path absolute = relative.toAbsolutePath();
		
		System.out.println(tmp);
		System.out.println(relative);
		System.out.println(absolute);
	}

}
