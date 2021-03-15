package chapter1.s5;

public class ExtendedClass extends BaseClass implements Printable{

	@Override
	public void print() {
		System.out.println("ExtendedClass print method");		
	}
	
	public void description() {
		System.out.println("ExtendedClass description method");
	}
	

}
