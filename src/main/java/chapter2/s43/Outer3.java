package chapter2.s43;

public class Outer3 {
	
	class Inner{}
	
	static void method() {
//		Inner inner = new Inner();	Outer instance'ı olmadığından derlenemez!
		
		Outer3 o = new Outer3();
		Inner in = o.new Inner();
		
//		veya
		
		Inner in2 = new Outer3().new Inner();
	}

}
