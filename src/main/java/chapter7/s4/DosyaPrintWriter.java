package chapter7.s4;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import chapter7.s1.FileHelloWorld;

public class DosyaPrintWriter {

	public static void main(String[] args)  {

		try {
			FileWriter fw = new FileWriter(FileHelloWorld.yol + "printWriter.txt", true);
			PrintWriter pw = new PrintWriter(fw);
			pw.write(97);
			pw.write("String");
			pw.write("PartialString", 0, 4);
			pw.write(new char[]{'c','h','a','r'});
			pw.write(new char[]{'c','h','a','r'}, 1, 1);
			
			pw.print(true);
			pw.print('a');
			pw.print(12.45f);
			pw.print(41.87);
			pw.print(39865L);
			pw.print(pw);
			pw.print(new Integer(10));
			
			pw.println(true);
			pw.println('a');
			pw.println(12.45f);
			pw.println(41.87);
			pw.println(39865L);
			pw.println(pw);
			pw.println(new Integer(10));

			pw.close();
		}
		catch (IOException ioe) {
			System.out.println(ioe);
		}
	}

}

