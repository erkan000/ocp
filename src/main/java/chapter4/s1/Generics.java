package chapter4.s1;

import tr.objects.BaseClass;
import tr.objects.ExtendedClassSamePackage;

public class Generics {

	public static void main(String[] args) {
		Parcel<BaseClass> pr = new Parcel<>();

		BaseClass t = new BaseClass();
		pr.set(t);
		
		ExtendedClassSamePackage ext = new ExtendedClassSamePackage();
		pr.set(ext);
		
		//String str = "";
		//map.setT(str);
		
		pr.set(null);
		
		//Object obj = new Object();
		//map.setT(obj);
		
		//Yukarıdaki ilk 2 örnek base class ve ondan miras alan sınıfları pass edebiliriz.
		// 3. de ise alakasız bir sınıfı pass edemeyiz.
		// 4. örnek de obje sınıfı da pass edilemez.
		
		
	}

}
