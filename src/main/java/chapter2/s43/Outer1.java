package chapter2.s43;

public class Outer1 {
	
	Inner inner = new Inner();
	
	class Inner{
		
//		final olmayan static tanımlanamaz!
//		static int b;
		
		final static int a = 4;
		
//		final olmayan static metod da tanımlanamaz
//		static void aa() {
//			
//		}
		
	}

}
