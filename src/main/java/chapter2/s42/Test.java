package chapter2.s42;

public class Test {
	public static void main(String[] args) {
		OuterStatic.StaticNested nested = new OuterStatic.StaticNested();
		System.out.println(nested.innerInstance);
	}
}
