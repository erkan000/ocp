package chapter2.s45;

public class Test {
	
	void method1() {
		class Inner{
			
		}
	}
	
static void method2() {
		class Inner{
			
		}
	}

void method3() {
//	Derlenmez, tanımdan sonra yazılmalı
//	Inner in = new Inner();
	
	class Inner{
		private int a;
		
	}
	
	Inner in = new Inner();
	
}
}
