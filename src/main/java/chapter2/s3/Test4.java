package chapter2.s3;

public class Test4 {

}

// Given
interface TestInterface {
    public abstract double calculateTax();
}

class testClass1 {
	public double calculateTax(){
		return 1;
	}
}

abstract class testClass2 implements TestInterface {
	public double calculateTax(double tax){
		return 1;
	}
}

//class testClass3 implements TestInterface {
//	public double calculateTax(double tax){
//		return 1;
//	}
//}
//
//
//abstract class testClass4 implements TestInterface {
//	public abstract void calculateTax(){
//		return 1;
//	}
//}
//
//class testClass5 implements TestInterface {
//	public abstract double calculateTax();
//}

