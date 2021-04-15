package chapter2.s43;

public class Outer2 {
	
	class Inner{}
	
	void method() {
		Inner inner = new Inner();
		
		class Inner2{
			
		}
	}

}

class Test{
	
	void test() {
		
		Outer2.Inner inner = new Outer2().new Inner();
		
	}
}
