package chapter8.s1;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathMethods {
	
	public static void main(String[] args) {
		Path p1 = Paths.get("chapter7_temp","data.txt");
		p1 = Paths.get("chapter7_temp/data.txt"); // yukardaki ile aynı
		
		System.out.println("toString()-> " + p1.toString());
		System.out.println("getRoot()-> " + p1.getRoot());
		System.out.println("getName(0)-> " + p1.getName(0));
		System.out.println("getName(1)-> " + p1.getName(1));
		System.out.println("getFileName()-> " + p1.getFileName());
		System.out.println("getNameCount()-> " + p1.getNameCount());
		System.out.println("getParent()-> " + p1.getParent());
		System.out.println("subpath(0,2)-> " + p1.subpath(0,2));
		
	}

}
