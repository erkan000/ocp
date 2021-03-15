package chapter4.s2;

import chapter4.s1.Parcel;

public class TypeInference {

	public static void main(String[] args) {
		Parcel<String> parcel = new Parcel<>();
		Parcel<String> parcel2 = new Parcel();
		
		//4.3.1 örneği
		new Parcel2<String>(new StringBuilder("Java"));

		//4.3.2 örneği
		Parcel3<String> p = new Parcel3<>();
		p.<Integer>deliver(new Integer(10));
		//parcel.<>deliver(new Integer(10));
		p.deliver("Hello");
		
	}
}

class Parcel2<T>{
	<X> Parcel2(X x) {
		// Constructor
	}	
}

class Parcel3<T>{
	<X> void deliver(X x) {
		System.out.println(x.getClass());
	}
}