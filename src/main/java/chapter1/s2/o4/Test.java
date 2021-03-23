package chapter1.s2.o4;

public class Test extends Ornek {

	static {
		System.out.println(4);
	}
	
	public static void main(String[] args) {
		System.out.println(5);
		//new Ornek().test();
		new Ornek().test();
		//Ornek.test();
		System.out.println("bitti");
	}

}
