package chapter6.s4;

import java.io.IOException;

public class IntersectionType {
	public static void main(String[] args) {
		try {
			int a = 120;
			if (a <= 10)throw new Exception1();
			else throw new Exception2();
		}
		catch (Exception1 | Exception2 ex) {	
			// Exception'lar IEx interface'ini implemente ettiği için info metoduna ulaşabildiler.
			// Normalde ulaşamazlar çünkü ex tipi Exception'dır.
			System.out.println(ex.info());
		}
	}

}

interface IEx {
	String info();
}
class Exception1 extends IOException implements IEx{
	private static final long serialVersionUID = 1L;

	public String info() {
		return "I'm Base Exception";
	}
}
class Exception2 extends Exception implements IEx {
	private static final long serialVersionUID = 1L;

	public String info() {
		return "I'm Derived Exception";
	}
}
