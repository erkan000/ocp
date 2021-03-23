package chapter1.s2.o2;

public class Hayvan {

	private int yasi;
	private static String cins;

	static {
		//
		cins = "Memeli";
		System.out.println(cins);
	}

	public Hayvan() {
		System.out.println(1);
	}

	public Hayvan(int yasi) {
		System.out.println(yasi);
	}
	
	void test(){
		System.out.println(5);
	}

}
