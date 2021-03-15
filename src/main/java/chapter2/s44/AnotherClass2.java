package chapter2.s44;

public class AnotherClass2 {
	
	PenInterface pen = new PenInterface() {
		
		@Override
		public void write2() {
			System.out.println("pen interface implementation");			
		}
	};

}
