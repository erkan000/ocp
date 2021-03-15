package tr.objects;

public class ExtendedClassSamePackage extends BaseClass {
	public ExtendedClassSamePackage() {
		//ExtendedClassSamePackage obj = new ExtendedClassSamePackage();
		
		//The field BaseClass.privateAccVariable is not visible
		//System.out.println(privateAccVariable);
		//System.out.println(obj.privateAccVariable);
		
		//System.out.println(obj.defaultAccVariable);
		//System.out.println(obj.protectedAccVariable);
		
		System.out.println(defaultAccVariable);
		System.out.println(protectedAccVariable);
	}
}
