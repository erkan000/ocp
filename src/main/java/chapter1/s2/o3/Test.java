package chapter1.s2.o3;

public class Test {
	
	static {
		System.out.println(9);
	}

	public static void main(String[] args) {
		Ornek1 o1 = new Ornek1();
		Ornek2 o2 = new Ornek2();
		Ornek2 o3 = new Ornek2();
		System.out.println(o1);
		System.out.println(o2);
		System.out.println(o3);
	}

}
