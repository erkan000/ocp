package chapter1.s2.o4;

public class Ornek {

	static {
		System.out.println(1);
		test();
	}

	
	
	public Ornek() {
		super();
		System.out.println(2);
		test();
	}



	public static void test() {
		System.out.println(3);
	}

}
