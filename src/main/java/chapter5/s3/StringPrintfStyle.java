package chapter5.s3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Formatter;

public class StringPrintfStyle {

	public static void main(String[] args) throws FileNotFoundException {
		
		// % b
		String name = "Shreya";
		Integer age = null;
		boolean isShort = false;
		System.out.format("Name %b, age %b, isShort %b", name, age, isShort);
		System.out.format("\nName defined %10b.", name);
		System.out.format("\nName defined %.1b.", name);
		System.out.format("\nName defined %-10b.", name);
		bosluk();
		
		// %c
		System.out.printf("\nChar %c", new Character('\u007b'));
		System.out.printf("\nChar %c", '\u6124');
		// System.out.printf("\nChar %c", new Boolean(true)); WONT COMPILE
		//System.out.printf("\nChar %c", '\affff'); //unicode değil!
		bosluk();
		
		// %f
		System.out.printf("\n[%f]", 12.12345);		//6 ya tamamlar
		System.out.printf("\n[%f]", 12.1234599);		//sonrasını yuvarlar
		System.out.printf("\n[%010f]", 12.12345);
		System.out.printf("\n[%-10f]", 12.12345);
		System.out.printf("\n[%10.2f]", 12.98765);
		System.out.printf("\n[%,f]", 123456789.12345);
		bosluk();

		// %d
		System.out.printf("\n[%d]", 12345);
		System.out.printf("\n[%010d]", 12345);
		System.out.printf("\n%(,d", -123456789);
		//System.out.printf("[%-10.2d]", 12345);	//IllegalFormatPrecisionException 
		bosluk();
		
		// %s
		String[] skills = {"Java", "Android"};
		System.out.format("Name is %s, age is %s, skills are %s", name, age, skills);
		age = 40;
		System.out.format("Name is %2$s, age is %1$s", name, age);
		
	}
	
	private static void bosluk(){
		System.out.println("");
		System.out.println("---");
		System.out.println("");
	}

}
