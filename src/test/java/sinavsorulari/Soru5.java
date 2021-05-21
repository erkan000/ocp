package sinavsorulari;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;

public class Soru5 {

	public static void main(String[] args) throws IOException {

		Path pp = Paths.get("/users");
		BasicFileAttributes data = Files.readAttributes(pp, BasicFileAttributes.class);
		System.out.println("Is a directory? " + data.isDirectory());
		
	}

}
