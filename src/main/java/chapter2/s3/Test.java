package chapter2.s3;

public class Test {
	
	public static void main(String[] args) {
		for (MyEnumCons en : MyEnumCons.values()) {
			System.out.println(en.ordinal() + " - " + en);
		}
	}

}
