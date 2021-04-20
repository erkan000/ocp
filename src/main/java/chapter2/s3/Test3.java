package chapter2.s3;

interface TheInterface {
	int field = 99;
	abstract void method();
}
abstract class TheAbstract {
	int field = 1983;
	abstract void method();
}
public class Test3 extends TheAbstract implements TheInterface {

	// void method public olmadan derlenemez!! görünürlüğü daha azaltmış oluruz!!
	
	public void method() {
		
		
	}
	
}
