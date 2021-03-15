package chapter5.s2;

import java.util.Scanner;

public class StringScanner {

	public static void main(String[] args) {
		Scanner scanner = new Scanner("The \tnew \nProgrammer exam");
		while (scanner.hasNext())
			System.out.println (scanner.next());
		
		System.out.println ("------");
		
		Scanner scanner2 = new Scanner("The1new22Programmer exam6");
		scanner2.useDelimiter("[\\d]+");
		while (scanner2.hasNext())
			System.out.println(scanner2.next());
		
		System.out.println ("------");
		
		Scanner sc = new Scanner ("1 2 4 The new 55 Programmer 44 exam");
		sc.useDelimiter("[\\sA-Za-z]+");
		int total = 0;
		while (sc.hasNextInt())
			System.out.println(sc.nextInt());
		
		System.out.println ("------");
		
		Scanner sca = new Scanner ("ABC 223,2343 Paul 10");
		sca.findInLine("(ABC)+[\\d]+\\.[\\d]+[A-Za-z]+[\\d]+");
		System.out.println(sca.next());
		System.out.println(sca.nextDouble());
		System.out.println(sca.next());
		System.out.println(sca.nextInt());

	}

}
