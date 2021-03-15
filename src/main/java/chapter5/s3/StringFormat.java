package chapter5.s3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Formatter;

public class StringFormat {

	public static void main(String[] args) throws FileNotFoundException {
		String name = "Shreya";
		Formatter formatter = new Formatter(new File("data.txt"));
		formatter.format("My name is %s", name);
		formatter.flush();
		formatter.close();
		System.out.printf("My name is %s", name);
		
		PrintStream pr = new PrintStream(new File("data2.txt"));
		pr.format("My name is %s", name);
		pr.flush();
		pr.close();

	}

}
