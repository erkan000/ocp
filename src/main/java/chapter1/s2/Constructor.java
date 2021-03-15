package chapter1.s2;

public class Constructor {

	//private Constructor() {}
	// HATA : dublicate method 
	// sadece access modifier değiştirerek overloaded constructor olmaz
	
	public Constructor() {
		this(3);
	}

	private Constructor(int a) {
		//this(5);
		// cons kendini çağıramaz!!
		// recursive constructor invocation
	}

	void test(){
		// this(3);
		// sadece constructor dan çağırılabilir satır.
	}
}
