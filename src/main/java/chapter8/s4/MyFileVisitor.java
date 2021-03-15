package chapter8.s4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.FileVisitor;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MyFileVisitor implements FileVisitor<Path> {
	
	Map<String, java.util.List<String>> flashcards = new HashMap<>();
	
	public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) {
		String dirName = dir.getFileName().toString();
		if (dirName.startsWith("code"))
			return FileVisitResult.SKIP_SUBTREE;
		else
			return FileVisitResult.CONTINUE;
	}
	public FileVisitResult postVisitDirectory(Path dir, IOException exc) {
		return FileVisitResult.CONTINUE;
	}
	public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {
		String fileName = file.getFileName().toString();
		if (fileName.endsWith(".txt")) {
			java.util.List<String> tips = new ArrayList<>();
			try (
					BufferedReader reader = new BufferedReader(
							new FileReader(file.toFile()));
					){
				String line = null;
				while((line = reader.readLine()) != null)
					tips.add(line);
			}
			catch (Exception e) {
				System.out.println(e);
			}
			flashcards.put(fileName.substring(0, fileName.length()-4),tips);
		}
		return FileVisitResult.CONTINUE;
	}
	public FileVisitResult visitFileFailed(Path file, IOException exc) {
		System.out.println(exc);
		return FileVisitResult.SKIP_SUBTREE;
	}
	public Map<String, java.util.List<String>> getFlashCardsMap() {
		return flashcards;
	}
}
