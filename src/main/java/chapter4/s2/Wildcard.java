package chapter4.s2;

import java.util.ArrayList;
import java.util.List;

public class Wildcard {

	public static void main(String[] args) {
		
		/** Buların hiçbiri derlenmez. Çünkü tipleri aynı değil!
		 * 
		List<Gift> w1 = new ArrayList<Book>();
		List<Book> w2 = new ArrayList<Gift>();
		List<Book> w3 = new ArrayList<Phone>();
		 * 
		 */
		
		// Bunun yerine wildcard kullanılır.

		List<?> w1 = new ArrayList<Book>();
		//List<Book> w2 = new ArrayList<?>(); WONT
		w1.add(null);
		//w1.add(new Object());
		//w1 listine hiçbirşey ekleyemeyiz!!!
		Object b = w1.get(0);
		for (Object item : w1) {
			System.out.println(item);
		}
		// iterate ederken yukardaki gibi object sınıfı olabilir sadece.
		
		List<Book> w2 = new ArrayList<Book>();
		List<Gift> w3 = new ArrayList<Gift>();
		
		test(w1);
		test(w2);
		test(w3);
		
		//test sınıfı tanımında herhangi bir tipteki listeden nesneleri alabilirsin var!
	}
	
	static void test(List<?> lst){
		for (Object object : lst) {
			System.out.println(object);
		}
	}
	
}

class Gift{}
class Book extends Gift{}
class Phone extends Gift{}
