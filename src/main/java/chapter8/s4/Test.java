package chapter8.s4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Test {

	public static void main(String[] args) throws IOException {
		Path path = Paths.get("src/main/resources");
		MyFileVisitor listFileNames = new MyFileVisitor();
		Files.walkFileTree(path, listFileNames);

	}
	
}
