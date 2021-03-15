package tr.objects.differentPackage;

import tr.objects.BaseClass;
import tr.objects.ExtendedClassSamePackage;

public class ExtendedClassDifferentPackage extends BaseClass {
	public ExtendedClassDifferentPackage() {
		ExtendedClassSamePackage obj = new ExtendedClassSamePackage();
		
		//The field BaseClass.privateAccVariable is not visible
		//System.out.println(privateAccVariable);
		//System.out.println(obj.privateAccVariable);
		
		//The field BaseClass.defaultAccVariable is not visible
		//System.out.println(obj.defaultAccVariable);
		//System.out.println(defaultAccVariable);
		
		//Burada bir fark var. Referance Variable ile protected değere ulaşılamaz!
		//The field BaseClass.protectedAccVariable is not visible
		//System.out.println(obj.protectedAccVariable);
		System.out.println(protectedAccVariable);
		System.out.println(obj);
	}
}


