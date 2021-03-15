package chapter4.s1;

import tr.objects.BaseClass;
import tr.objects.ExtendedClassSamePackage;

public class Generics2 {

	public static void main(String[] args) {
		Parcel4<BaseClass,Integer> pr = new Parcel4<>();

		// Parcel4 tanımı String olmasına rağmen biz burada Integer gönderiyoruz.
		BaseClass t = new BaseClass();	
	
		
	}

}
