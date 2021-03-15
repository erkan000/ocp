package chapter4.s2;

import java.util.ArrayList;
import java.util.List;

public class WildcardBounded {

	public static void main(String[] args) {
		
		List<? extends Gift> myList1 = new ArrayList<Gift>();
		List<? extends Gift> myList2 = new ArrayList<Book>();
		List<? extends Gift> myList3 = new ArrayList<Phone>();
		// Ağapıdaki örnekte ise bu list sadece base'i gift olan sınıfları alabilir
		//List<? extends Gift> myList4 = new ArrayList<String>();
		//List<? extends Gift> myList4 = new ArrayList<Object>();
				
		List<?> myList4 = new ArrayList<Phone>();
		List<String> myList5 = new ArrayList<String>();
		
		wrapGift(myList1); //sınıfın kendisi pass edilebilir.
		wrapGift(myList2); //sınıfın subclass ları pass edilebilir.
		wrapGift(myList3);
		// Aşağıdaki 2 örnek ise WONT COMPILE!
		// Çünkü wrapGift metodu sadece Gift sınıfından extend olan sınıfları kabul eder.
		//wrapGift(myList4);
		//wrapGift(myList5);
		
	}
	
	public static void wrapGift(List<? extends Gift> list) {
		for (Gift item : list) {
			System.out.println("GiftWrap - " + item);
		}
		//VEYAA
		for (Object item : list) {
			System.out.println("GiftWrap - " + item);
		}
	}	
}
