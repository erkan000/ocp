package chapter8.s1;

import java.nio.file.Path;
import java.nio.file.Paths;

public class ResolveReverse {
	
	public static void main(String[] args) {
		
		Path path = Paths.get("/mydir/eWorld.java");
		Path renamePath = path.resolveSibling(Paths.get("newWorld.java"));
		Path copyPath = path.resolveSibling("backup/eWorld.java");
		Path absolutePath = Paths.get("E:/OCPJavaSE7/");
		System.out.println(renamePath);
		System.out.println(copyPath);
		System.out.println(path.resolveSibling(""));
		System.out.println(absolutePath.resolveSibling(path));
		System.out.println(path.resolveSibling(absolutePath));
		
	}

}
