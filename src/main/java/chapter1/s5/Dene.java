package chapter1.s5;

import tr.types.Arayuz;

public class Dene {
	
	public static void main(String[] args) {
		
		BaseClass b = new ExtendedClass();
		Printable i = new ExtendedClass();
		
		// Referans tipin metodlarına bakılır.
		i.print();
		((ExtendedClass)i).description();
		
		// Explicit Downcasting derlenir ama hiçbir zaman çalışmaz.
		BaseClass baseClass = new BaseClass();
		ExtendedClass e1 = (ExtendedClass)baseClass;
		Printable e2 = (Printable)baseClass;
		Arayuz e3 = (Arayuz)baseClass;		
//		Arayuz e4 = (Arayuz)""; 	String sınıfı final sınıf olduğu için!
		
		Arayuz n1 = (Arayuz)null;
		ExtendedClass n2 = (ExtendedClass)null;
		
		
	}

}
